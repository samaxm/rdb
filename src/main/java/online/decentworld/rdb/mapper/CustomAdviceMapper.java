package online.decentworld.rdb.mapper;

import online.decentworld.rdb.entity.CustomAdvice;


public interface CustomAdviceMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_advice
     *
     * @mbggenerated Mon Aug 29 09:22:51 CST 2016
     */
    int deleteByPrimaryKey(Integer adviceId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_advice
     *
     * @mbggenerated Mon Aug 29 09:22:51 CST 2016
     */
    int insert(CustomAdvice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_advice
     *
     * @mbggenerated Mon Aug 29 09:22:51 CST 2016
     */
    int insertSelective(CustomAdvice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_advice
     *
     * @mbggenerated Mon Aug 29 09:22:51 CST 2016
     */
    CustomAdvice selectByPrimaryKey(Integer adviceId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_advice
     *
     * @mbggenerated Mon Aug 29 09:22:51 CST 2016
     */
    int updateByPrimaryKeySelective(CustomAdvice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_advice
     *
     * @mbggenerated Mon Aug 29 09:22:51 CST 2016
     */
    int updateByPrimaryKey(CustomAdvice record);
}