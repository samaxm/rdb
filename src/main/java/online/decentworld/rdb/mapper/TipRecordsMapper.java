package online.decentworld.rdb.mapper;

import online.decentworld.rdb.entity.TipRecords;

public interface TipRecordsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_tip_records
     *
     * @mbggenerated Wed Nov 16 10:14:03 CST 2016
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_tip_records
     *
     * @mbggenerated Wed Nov 16 10:14:03 CST 2016
     */
    int insert(TipRecords record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_tip_records
     *
     * @mbggenerated Wed Nov 16 10:14:03 CST 2016
     */
    int insertSelective(TipRecords record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_tip_records
     *
     * @mbggenerated Wed Nov 16 10:14:03 CST 2016
     */
    TipRecords selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_tip_records
     *
     * @mbggenerated Wed Nov 16 10:14:03 CST 2016
     */
    int updateByPrimaryKeySelective(TipRecords record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_tip_records
     *
     * @mbggenerated Wed Nov 16 10:14:03 CST 2016
     */
    int updateByPrimaryKey(TipRecords record);
}