package online.decentworld.rdb.mapper;

import online.decentworld.rdb.entity.Order;

public interface OrderMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order
     *
     * @mbggenerated Sat Sep 24 17:53:19 CST 2016
     */
    int deleteByPrimaryKey(String ordernumer);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order
     *
     * @mbggenerated Sat Sep 24 17:53:19 CST 2016
     */
    int insert(Order record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order
     *
     * @mbggenerated Sat Sep 24 17:53:19 CST 2016
     */
    int insertSelective(Order record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order
     *
     * @mbggenerated Sat Sep 24 17:53:19 CST 2016
     */
    Order selectByPrimaryKey(String ordernumer);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order
     *
     * @mbggenerated Sat Sep 24 17:53:19 CST 2016
     */
    int updateByPrimaryKeySelective(Order record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order
     *
     * @mbggenerated Sat Sep 24 17:53:19 CST 2016
     */
    int updateByPrimaryKey(Order record);
}