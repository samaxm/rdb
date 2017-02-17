package online.decentworld.rdb;

import online.decentworld.rdb.config.DBConfig;
import online.decentworld.rdb.entity.ActivityAnswer;
import online.decentworld.rdb.mapper.ActivityAnswerMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Calendar;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={DBConfig.class})
public class ServiceTest {
//	@Autowired
//	private UserMapper userMapper;
//	@Autowired
//	private ChatRecordMapper chatRecordMapper;
//	@Autowired
//	private LikeRecordMapper likeRecordMapper;
//	@Autowired
//	private DataSourceTransactionManager tx;
//	@Autowired
//	private TransferHistoryMapper transferHistoryMapper;
//	@Autowired
//	private WealthMapper wealthMapper;
//	@Autowired
//	private PartnerCodeMapper mapper;
//	@Autowired
//	private VipRecordsMapper vipRecordsMapper;
	@Autowired
	private ActivityAnswerMapper activityAnswerMapper;


	@Test
	public void testActivityAnswer(){
		ActivityAnswer answer=activityAnswerMapper.selectForUpdate(1);
		System.out.println(answer.getAnswer());
//		ActivityAnswer answer=new ActivityAnswer();
//		answer.setActivityid(1);
//		answer.setAnswer("小鸡炖蘑菇");
//		answer.setChecked(false);
//
//		activityAnswerMapper.insert(answer);
//		List<ActivityAnswer> activityAnswers=activityAnswerMapper.getActivitieAnswers(1);
//		System.out.println(activityAnswers.size());
//		activityAnswers.forEach(an->{
//			int id=an.getId();
//			activityAnswerMapper.updateAnswerStatus(id,true,"");
//		});
	}

	@Test
	public void test() throws InterruptedException {

		Calendar calendar=Calendar.getInstance();
		calendar.set(Calendar.HOUR_OF_DAY,0);
		calendar.set(Calendar.MINUTE,0);
		calendar.set(Calendar.SECOND,0);
		calendar.set(Calendar.MILLISECOND,0);
		long dateNum=calendar.getTimeInMillis();

//		calendar.set(Calendar.HOUR,22);
//		long beginTime=calendar.getTimeInMillis();
//		calendar.set(Calendar.HOUR,6);
//		calendar.set(Calendar.DATE,calendar.get(Calendar.DATE)+1);
//		long endTime=calendar.getTimeInMillis();
//		System.out.println(beginTime);
//		System.out.println(endTime);
		System.out.println(dateNum);
//		Activity activity=new Activity();
//		activity.setBegintime(new Date(beginTime));
//		activity.setEndtime(new Date(endTime));
//		activity.setDatenum(dateNum);
//		activity.setImgUrl("http://a.xiumi.us/stage/v5/2CXxe/31233930");
//		activityMapper.insert(activity);
//		List<Activity> activities=activityMapper.getActivityByDateNum(dateNum);
//		System.out.println(activities.size());

//		VipRecords records=vipRecordsMapper.selectByPrimaryKey("0215043174");
//		System.out.println(JSON.toJSONString(records));
//		TransferHistory t=new TransferHistory("123",1,"123","123");
//		transferHistoryMapper.insert(t);
//		System.out.println(t.getId());
//		List<Long> list=new LinkedList<>();
//		list.add(1l);
//		list.add(2l);
//		list.add(3l);
//		List s=chatRecordMapper.searchRecordsByID(list);
//		System.out.println(s.size());
//		List<LikeRecordDetail> list=likeRecordMapper.getLikeRecords("2419918324");
//		System.out.println(JSON.toJSONString(list));
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
