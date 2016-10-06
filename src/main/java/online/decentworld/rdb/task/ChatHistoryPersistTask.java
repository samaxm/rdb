package online.decentworld.rdb.task;

import online.decentworld.cache.redis.CacheKey;
import online.decentworld.cache.redis.RedisTemplate;
import online.decentworld.cache.redis.ReturnResult;
import online.decentworld.rdb.entity.ChatIndex;
import online.decentworld.rdb.entity.ChatRecord;
import online.decentworld.rdb.mapper.ChatIndexMapper;
import online.decentworld.rdb.mapper.ChatRecordMapper;
import online.decentworld.rpc.codc.Codec;
import online.decentworld.rpc.dto.message.ChatMessage;
import online.decentworld.rpc.dto.message.MessageWrapper;
import online.decentworld.rpc.dto.message.types.MessageType;
import online.decentworld.tools.LogUtil;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import redis.clients.jedis.Jedis;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * Created by Sammax on 2016/10/3.
 */
public class ChatHistoryPersistTask implements Job{

    private static Logger logger= LoggerFactory.getLogger(ChatHistoryPersistTask.class);
    private Codec codec;
    private ChatIndexMapper indexMapper;
    private ChatRecordMapper recordMapper;



    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        logger.debug("[BEGIN_CHAT_RECORD_PERSIST_TASK]");
        RedisTemplate template=new RedisTemplate();
        ReturnResult result=template.cache((Jedis jedis)->{
            List<byte[]> list=null;
            Set<String> ids=jedis.smembers(CacheKey.MESSSAGE_STORE_SET);
            list=template.getFromHSETBytes(CacheKey.CHAT,ids,jedis);
            return ReturnResult.result(list);
        });
        if(result.isSuccess()&&result.getResult()!=null){
            List<byte[]> msgs= (List<byte[]>) result.getResult();
            List<Long> stored=new LinkedList<>();
            List<Long> failed=new LinkedList<>();
            msgs.forEach((byte[] data)->{
                Long mid=null;
                try {
                    MessageWrapper mw = codec.decode(data);
                    if (mw.getType() == MessageType.CHAT) {
                        String receiver = mw.getReceiver();
                        String sender = mw.getSender();
                        mid = ((ChatMessage) mw.getBody()).getMid();
                        ChatIndex index = new ChatIndex(sender, receiver, true, mid);
                        ChatIndex index2 = new ChatIndex(receiver, sender, false, mid);
                        ChatRecord cr = new ChatRecord();
                        cr.setMid(mid);
                        cr.setData(codec.encode(mw));
                        indexMapper.insert(index);
                        indexMapper.insert(index2);
                        recordMapper.insert(cr);
                        stored.add(mid);
                        mid=null;
                    }
                }catch (Exception e){
                    logger.warn("[ERROR_PERSIST] ",e);
                    if(mid!=null){
                        failed.add(mid);
                    }
                    mid=null;
                }
            });
            //clean cache
            ReturnResult result1=template.cache((Jedis jedis)->{
                if(failed.size()!=0){
                    jedis.rpush(CacheKey.FAIL_STROE_MSG,failed.toArray(new String[failed.size()]));
                }
                stored.addAll(failed);
                if(stored.size()!=0)
                    jedis.hdel(CacheKey.CHAT,stored.toArray(new String[stored.size()]));
                return ReturnResult.SUCCESS;
            });
            if(!result1.isSuccess()){
                logger.warn("[CLEAN_CHAT_CACHE_FAIL] stored#"+ LogUtil.toLogString(stored));
            }
        }
    }


    public void setCodec(Codec codec) {
        this.codec = codec;
    }

    public void setIndexMapper(ChatIndexMapper indexMapper) {
        this.indexMapper = indexMapper;
    }
    public void setRecordMapper(ChatRecordMapper recordMapper) {
        this.recordMapper = recordMapper;
    }
}
