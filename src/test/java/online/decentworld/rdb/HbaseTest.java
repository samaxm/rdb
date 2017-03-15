package online.decentworld.rdb;

import online.decentworld.cache.redis.CacheKey;
import online.decentworld.cache.redis.RedisTemplate;
import online.decentworld.cache.redis.ReturnResult;
import online.decentworld.rdb.hbase.HbaseClient;
import online.decentworld.rdb.hbase.PutRequest;
import online.decentworld.tools.MD5;
import redis.clients.jedis.Jedis;

import java.io.IOException;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * Created by Sammax on 2016/11/22.
 */
public class HbaseTest {
    private static String chat_table_prefix="chat";
    private static String records_cf="records";
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//       test();
        Class.forName("org.apache.hadoop.hbase.util.ByteStringer");
    }
    public static  void test() {
        RedisTemplate template = new RedisTemplate();
        ReturnResult result = template.cache((Jedis jedis) -> {
            List<byte[]> list = null;
            Set<String> ids = jedis.smembers(CacheKey.MESSSAGE_STORE_SET);
            list = template.getFromHSETBytes(CacheKey.MESSAGE, ids, jedis);
            return ReturnResult.result(list);
        });
        if (result.isSuccess() && result.getResult() != null) {
            List<byte[]> msgs = (List<byte[]>) result.getResult();
            List<Long> stored = new LinkedList<>();
            List<Long> failed = new LinkedList<>();
            Calendar calendar = Calendar.getInstance();
            int month = calendar.get(Calendar.MONTH);
            int year = calendar.get(Calendar.YEAR);
            String subfix = String.valueOf(year) + String.valueOf(month);
            PutRequest request = new PutRequest((chat_table_prefix + subfix).getBytes(), records_cf.getBytes());
            msgs.forEach((byte[] data) -> {
                long mid = -1;
                try {
//                    MessageProtos.Message msg = MessageProtos.Message.parseFrom(data);
//                    String from = msg.getFrom();
//                    String to = msg.getTo();
                    byte[] rowkey = getRowKey("123","456", month, year);
                    mid = System.currentTimeMillis();
                    request.add(rowkey, String.valueOf(mid).getBytes(), data);
//                    if (mw.getType() == MessageType.CHAT_TEXT||
//                            mw.getType() == MessageType.CHAT_IMAGE||
//                            mw.getType() == MessageType.CHAT_AUDIO) {
//                        String receiver = mw.getReceiverID();
//                        String sender = mw.getSenderID();
//                        ChatIndex index = new ChatIndex(sender, receiver, true, mid);
//                        ChatIndex index2 = new ChatIndex(receiver, sender, false, mid);
//                        ChatRecord cr = new ChatRecord();
//                        cr.setMid(mid);
//                        cr.setData(codec.encode(mw));
//                        indexMapper.insert(index);
//                        indexMapper.insert(index2);
//                        recordMapper.insert(cr);
//                    }
                    stored.add(mid);
                } catch (Exception e) {
                    if (mid != -1) {
                        failed.add(mid);
                    }
                }
            });
            try {
                HbaseClient.instance().put(request);
                //clean cache
//                ReturnResult result1=template.cache((Jedis jedis)->{
//                    if(failed.size()!=0){
//                        jedis.rpush(CacheKey.FAIL_STROE_MSG,failed.toArray(new String[failed.size()]));
//                    }
//                    stored.addAll(failed);
//                    if(stored.size()!=0)
//                        jedis.hdel(CacheKey.MESSAGE,stored.toArray(new String[stored.size()]));
//                    return ReturnResult.SUCCESS;
//                });
//                if(!result1.isSuccess()){
//                    logger.warn("[CLEAN_CHAT_CACHE_FAIL] stored#"+ LogUtil.toLogString(stored));
//                }
            } catch (IOException e) {
            }

        }
    }

    /*
        rowkey: smallID+bigID+month ->MD5
     */
    private static byte[] getRowKey(String from,String to,int month,int year){
        String rowKey=String.valueOf(year)+String.valueOf(month);
        if(Long.parseLong(from)>Long.parseLong(to)){
            rowKey=to+from+rowKey;
        }else{
            rowKey=from+to+rowKey;
        }
        return MD5.getMD5(rowKey);
    }
}
