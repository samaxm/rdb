package online.decentworld.rdb;

import online.decentworld.rdb.config.DBConfig;
import online.decentworld.rdb.entity.AppVersion;
import online.decentworld.rdb.entity.DBChargeResult;
import online.decentworld.rdb.entity.ID;
import online.decentworld.rdb.entity.Wealth;
import online.decentworld.rdb.mapper.AppVersionMapper;
import online.decentworld.rdb.mapper.IDMapper;
import online.decentworld.rdb.mapper.WealthMapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.HashMap;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={DBConfig.class})
public class ServiceTest {

	@Autowired
	private IDMapper mapper;

	@Test
	public void test() throws InterruptedException {
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
//		Thread.currentThread().sleep(20000);

	}
}
