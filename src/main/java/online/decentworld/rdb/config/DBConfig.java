package online.decentworld.rdb.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import online.decentworld.rdb.mapper.*;
import online.decentworld.tools.EnvironmentCofing;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperFactoryBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;
import java.io.IOException;


/**
 * @author Sammax
 */
@Configuration
@EnableTransactionManagement
public class DBConfig {
	
	private static Logger logger=LoggerFactory.getLogger(DBConfig.class);
	

//	private static String ENVIORMENT="server_develop";

	@Bean
	public DataSourceTransactionManager getTXManager(DataSource ds){
		DataSourceTransactionManager manager=new DataSourceTransactionManager();
		manager.setDataSource(ds);
		return manager;
	}
	@Bean
	public MapperFactoryBean<WealthMapper> getWealthMapper(SqlSessionFactoryBean bean) throws Exception{
		MapperFactoryBean<WealthMapper> mapper=new MapperFactoryBean<WealthMapper>();
		mapper.setMapperInterface(WealthMapper.class);
		mapper.setSqlSessionFactory(bean.getObject());
		return mapper;
	}
	
	@Bean
	public MapperFactoryBean<LikeRecordMapper> getLikeRecordMapper(SqlSessionFactoryBean bean) throws Exception{
		MapperFactoryBean<LikeRecordMapper> mapper=new MapperFactoryBean<LikeRecordMapper>();
		mapper.setMapperInterface(LikeRecordMapper.class);
		mapper.setSqlSessionFactory(bean.getObject());
		return mapper;
	}

	@Bean
	public MapperFactoryBean<StrangerContactMapper> getStrangerContactMapper(SqlSessionFactoryBean bean) throws Exception{
		MapperFactoryBean<StrangerContactMapper> mapper=new MapperFactoryBean<StrangerContactMapper>();
		mapper.setMapperInterface(StrangerContactMapper.class);
		mapper.setSqlSessionFactory(bean.getObject());
		return mapper;
	}
	@Bean
	public MapperFactoryBean<FriendContactMapper> getFriendContactMapper(SqlSessionFactoryBean bean) throws Exception{
		MapperFactoryBean<FriendContactMapper> mapper=new MapperFactoryBean<FriendContactMapper>();
		mapper.setMapperInterface(FriendContactMapper.class);
		mapper.setSqlSessionFactory(bean.getObject());
		return mapper;
	}



	@Bean
	public MapperFactoryBean<IDMapper> getIDMapper(SqlSessionFactoryBean bean) throws Exception{
		MapperFactoryBean<IDMapper> mapper=new MapperFactoryBean<IDMapper>();
		mapper.setMapperInterface(IDMapper.class);
		mapper.setSqlSessionFactory(bean.getObject());
		return mapper;
	}

	@Bean
	public MapperFactoryBean<CustomAdviceMapper> getCustomAdviceMapper(SqlSessionFactoryBean bean) throws Exception{
		MapperFactoryBean<CustomAdviceMapper> mapper=new MapperFactoryBean<CustomAdviceMapper>();
		mapper.setMapperInterface(CustomAdviceMapper.class);
		mapper.setSqlSessionFactory(bean.getObject());
		return mapper;
	}
	
	@Bean
	public MapperFactoryBean<UserMapper> getUserMapper(SqlSessionFactoryBean bean) throws Exception{
		MapperFactoryBean<UserMapper> mapper=new MapperFactoryBean<UserMapper>();
		mapper.setMapperInterface(UserMapper.class);
		mapper.setSqlSessionFactory(bean.getObject());
		return mapper;
	}
	
	@Bean
	public MapperFactoryBean<JokeMapper> getJokeMapper(SqlSessionFactoryBean bean) throws Exception{
		MapperFactoryBean<JokeMapper> mapper=new MapperFactoryBean<JokeMapper>();
		mapper.setMapperInterface(JokeMapper.class);
		mapper.setSqlSessionFactory(bean.getObject());
		return mapper;
	}
	
	@Bean
	public MapperFactoryBean<AppVersionMapper> getAppVersionMapper(SqlSessionFactoryBean bean) throws Exception{
		MapperFactoryBean<AppVersionMapper> mapper=new MapperFactoryBean<AppVersionMapper>();
		mapper.setMapperInterface(AppVersionMapper.class);
		mapper.setSqlSessionFactory(bean.getObject());
		return mapper;
	}
	
	@Bean
	public MapperFactoryBean<UserInfoMapper> getPhoneNumMapper(SqlSessionFactoryBean bean) throws Exception{
		MapperFactoryBean<UserInfoMapper> mapper=new MapperFactoryBean<UserInfoMapper>();
		mapper.setMapperInterface(UserInfoMapper.class);
		mapper.setSqlSessionFactory(bean.getObject());
		return mapper;
	}

	@Bean
	public MapperFactoryBean<ChatRecordMapper> getChatRecordMapper(SqlSessionFactoryBean bean) throws Exception{
		MapperFactoryBean<ChatRecordMapper> mapper=new MapperFactoryBean<ChatRecordMapper>();
		mapper.setMapperInterface(ChatRecordMapper.class);
		mapper.setSqlSessionFactory(bean.getObject());
		return mapper;
	}

	@Bean
	public MapperFactoryBean<ChatIndexMapper> getChatIndexMapper(SqlSessionFactoryBean bean) throws Exception{
		MapperFactoryBean<ChatIndexMapper> mapper=new MapperFactoryBean<ChatIndexMapper>();
		mapper.setMapperInterface(ChatIndexMapper.class);
		mapper.setSqlSessionFactory(bean.getObject());
		return mapper;
	}

	@Bean
	public MapperFactoryBean<ConsumePriceMapper> getConsumePriceMapper(SqlSessionFactoryBean bean) throws Exception{
		MapperFactoryBean<ConsumePriceMapper> mapper=new MapperFactoryBean<ConsumePriceMapper>();
		mapper.setMapperInterface(ConsumePriceMapper.class);
		mapper.setSqlSessionFactory(bean.getObject());
		return mapper;
	}

	@Bean
	public MapperFactoryBean<OrderMapper> getOrderMapper(SqlSessionFactoryBean bean) throws Exception{
		MapperFactoryBean<OrderMapper> mapper=new MapperFactoryBean<OrderMapper>();
		mapper.setMapperInterface(OrderMapper.class);
		mapper.setSqlSessionFactory(bean.getObject());
		return mapper;
	}
	@Bean
	public MapperFactoryBean<ActivityAnswerMapper> getActivityAnswerMapper(SqlSessionFactoryBean bean) throws Exception{
		MapperFactoryBean<ActivityAnswerMapper> mapper=new MapperFactoryBean<ActivityAnswerMapper>();
		mapper.setMapperInterface(ActivityAnswerMapper.class);
		mapper.setSqlSessionFactory(bean.getObject());
		return mapper;
	}

	@Bean
	public MapperFactoryBean<TransferHistoryMapper> getTransferHistoryMapper(SqlSessionFactoryBean bean) throws Exception{
		MapperFactoryBean<TransferHistoryMapper> mapper=new MapperFactoryBean<TransferHistoryMapper>();
		mapper.setMapperInterface(TransferHistoryMapper.class);
		mapper.setSqlSessionFactory(bean.getObject());
		return mapper;
	}

	@Bean
	public MapperFactoryBean<TipRecordsMapper> getTipRecordsMapper(SqlSessionFactoryBean bean) throws Exception{
		MapperFactoryBean<TipRecordsMapper> mapper=new MapperFactoryBean<TipRecordsMapper>();
		mapper.setMapperInterface(TipRecordsMapper.class);
		mapper.setSqlSessionFactory(bean.getObject());
		return mapper;
	}

	@Bean
	public MapperFactoryBean<ReportRecordMapper> getReportRecord(SqlSessionFactoryBean bean) throws Exception{
		MapperFactoryBean<ReportRecordMapper> mapper=new MapperFactoryBean<ReportRecordMapper>();
		mapper.setMapperInterface(ReportRecordMapper.class);
		mapper.setSqlSessionFactory(bean.getObject());
		return mapper;
	}

	@Bean
	public MapperFactoryBean<PartnerCodeMapper> getPartnerCodeMapper(SqlSessionFactoryBean bean) throws Exception{
		MapperFactoryBean<PartnerCodeMapper> mapper=new MapperFactoryBean<PartnerCodeMapper>();
		mapper.setMapperInterface(PartnerCodeMapper.class);
		mapper.setSqlSessionFactory(bean.getObject());
		return mapper;
	}

	@Bean
	public MapperFactoryBean<WorthChangeRecordsMapper> getWorthChangeRecordsMapper(SqlSessionFactoryBean bean) throws Exception{
		MapperFactoryBean<WorthChangeRecordsMapper> mapper=new MapperFactoryBean<WorthChangeRecordsMapper>();
		mapper.setMapperInterface(WorthChangeRecordsMapper.class);
		mapper.setSqlSessionFactory(bean.getObject());
		return mapper;
	}

	@Bean
	public MapperFactoryBean<VipRecordsMapper> getVipRecordsMapper(SqlSessionFactoryBean bean) throws Exception{
		MapperFactoryBean<VipRecordsMapper> mapper=new MapperFactoryBean<VipRecordsMapper>();
		mapper.setMapperInterface(VipRecordsMapper.class);
		mapper.setSqlSessionFactory(bean.getObject());
		return mapper;
	}

	@Bean
	public MapperFactoryBean<ActivityMapper> getActivityMapper(SqlSessionFactoryBean bean) throws Exception{
		MapperFactoryBean<ActivityMapper> mapper=new MapperFactoryBean<ActivityMapper>();
		mapper.setMapperInterface(ActivityMapper.class);
		mapper.setSqlSessionFactory(bean.getObject());
		return mapper;
	}




	/**
	 * SqlSessionFacory config
	 * @param ds
	 * @return
	 * @throws IOException 
	 */
	@Bean
	public SqlSessionFactoryBean getSqlSessionFactory(DataSource ds) throws IOException{
		SqlSessionFactoryBean bean=new SqlSessionFactoryBean();
//		PathMatchingResourcePatternResolver loader=new PathMatchingResourcePatternResolver();
//		Resource[] resouces=loader.getResources("classpath*:online/decentworld/face2face/dao/mapper/*.xml");
		bean.setDataSource(ds);
//		bean.setMapperLocations(resouces);
		return bean;
	}
	
	
	
	/**
	 * DataSource Config
	 * @return
	 * @throws PropertyVetoException
	 */
	@Bean
	public DataSource getC3p0DataSoure() throws PropertyVetoException{

//		String path=DBConfig.class.getClassLoader().getResource("c3p0-config.xml").getPath();
//		path=path.replace("file","classloader");
//		logger.info("[C3P0_CONFIG_PATH] #"+path);
//		System.setProperty("com.mchange.v2.c3p0.cfg.xml", path);

		ComboPooledDataSource cpds = new ComboPooledDataSource(EnvironmentCofing.environment.name());
//		ComboPooledDataSource cpds = new ComboPooledDataSource(Environment.SERVER.name());
//		ComboPooledDataSource cpds = new ComboPooledDataSource(Environment.LOCAL.name());
//				ComboPooledDataSource cpds = new ComboPooledDataSource("LOCAL");
//		HashMap<String,DataSource> map=new HashMap<>(1);
//		map.put(EnvironmentCofing.environment.name().toUpperCase(),cpds);
//		DataSourceRule dataSourceRule=new DataSourceRule(map);
//		TableRule chatIndexTableRule=TableRule.builder("t_chat_index").dataSourceRule(dataSourceRule)
//				.actualTables(Arrays.asList("t_chat_index_0","t_chat_index_1"))
//				.tableShardingStrategy(new TableShardingStrategy("dwID", new ChatIndexTableShardingStrategy()))
//				.build();
//
//		TableRule chatRecordTableRule=TableRule.builder("t_chat_record").dataSourceRule(dataSourceRule)
//				.actualTables(Arrays.asList("t_chat_record_0", "t_chat_record_1", "t_chat_record_2", "t_chat_record_3", "t_chat_record_4","t_chat_record_5",
//						"t_chat_record_6","t_chat_record_7","t_chat_record_8","t_chat_record_9"))
//				.tableShardingStrategy(new TableShardingStrategy("mid", new ChatRecordTableShardingStrategy()))
//				.build();
//
//		ShardingRule shardingRule = ShardingRule.builder()
//				.dataSourceRule(dataSourceRule)
//				.tableRules(Arrays.asList(chatIndexTableRule, chatRecordTableRule))
//				.build();
//		DataSource dataSource = ShardingDataSourceFactory.createDataSource(shardingRule);

		return cpds;
	}



	public static void main(String[] args) {
		String path="file:/decentworld/tomcat/apache-tomcat-7.0.64/webapps/face2face/WEB-INF/lib/rdb-0.0.1-SNAPSHOT.jar!/online/decentworld/rdb/config/c3p0-config.xml";
		path=path.replace("file:", "classloader:");
		System.out.println(path);
	}
}
