package online.decentworld.rdb;

import online.decentworld.rdb.config.DBConfig;
import online.decentworld.rdb.entity.User;
import online.decentworld.rdb.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={DBConfig.class})
public class ServiceTest {

	@Autowired
	private UserMapper mapper;
	@Autowired
	private DataSourceTransactionManager tx;


	@Test
	public void test() throws InterruptedException {
		User user=mapper.selectByPhoneNum("123");
		System.out.println(user.getName());
//		mapper.updateTest("123");


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
