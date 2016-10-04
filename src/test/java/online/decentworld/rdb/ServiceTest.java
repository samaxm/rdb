package online.decentworld.rdb;

import com.alibaba.fastjson.JSON;
import online.decentworld.cache.redis.CacheKey;
import online.decentworld.cache.redis.RedisTemplate;
import online.decentworld.cache.redis.ReturnResult;
import online.decentworld.rdb.config.DBConfig;
import online.decentworld.rdb.entity.ChatIndex;
import online.decentworld.rdb.entity.ChatRecord;
import online.decentworld.rdb.entity.LikeRecordDetail;
import online.decentworld.rdb.entity.User;
import online.decentworld.rdb.mapper.*;
import online.decentworld.rpc.codc.protos.ReflectBodyConverterFactory;
import online.decentworld.rpc.codc.protos.SimpleProtosCodec;
import online.decentworld.rpc.dto.message.MessageWrapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import redis.clients.jedis.Jedis;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={DBConfig.class})
public class ServiceTest {

	@Autowired
	private UserMapper userMapper;
	@Autowired
	private ChatRecordMapper chatRecordMapper;
	@Autowired
	private LikeRecordMapper likeRecordMapper;
	@Autowired
	private DataSourceTransactionManager tx;


	@Test
	public void test() throws InterruptedException {

		List<LikeRecordDetail> list=likeRecordMapper.getLikeRecords("2419918324");
		System.out.println(JSON.toJSONString(list));
//		RedisTemplate template=new RedisTemplate();
////		SimpleProtosCodec code=new SimpleProtosCodec();
////		code.setConverterFactory(new ReflectBodyConverterFactory());
////		ChatRecord record=chatRecordMapper.selectByPrimaryKey(1l);
////		MessageWrapper mw=code.decode(record.getData());
////		System.out.println(mw.getType().name());
//		List<ChatRecord> records=new LinkedList<>();
//		template.cache((Jedis jedis)->{
//			Map<byte[], byte[]> data=jedis.hgetAll(CacheKey.CHAT.getBytes());
//			data.forEach((byte[] key,byte[] value)->{
//				long mid=Long.valueOf(new String(key));
//				System.out.println(mid);
//				ChatRecord record=new ChatRecord();
//				record.setData(value);
//				record.setMid(mid);
//				records.add(record);
//
//			});
//			return ReturnResult.SUCCESS;
//		});
//		chatRecordMapper.batchInsertRecord(records);
//		ID id=mapper.getChatID();
//		System.out.println(id.getChatIdRoof());
//		mapper.updateChatID(1000);
//		id=mapper.getChatID();
//		System.out.println(id.getChatIdRoof());
//		for(int i=0;i<100;i++){
//			new Thread(()->{
//				try {
//					Thread.currentThread().sleep(500);
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
//				DBChargeResult result=mapper.charge("123", 1);
//				if(result!=null){
//					System.out.println(result.getNewWealth()+":"+result.getResultCode());
//				}
//
//			}).start();
//
//		}
//		Thread.currentThread().sleep(60000);

	}
}
