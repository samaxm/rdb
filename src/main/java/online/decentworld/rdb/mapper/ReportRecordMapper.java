package online.decentworld.rdb.mapper;

import online.decentworld.rdb.entity.ReportRecord;

public interface ReportRecordMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_report
     *
     * @mbggenerated Fri Aug 19 12:12:59 CST 2016
     */
    int deleteByPrimaryKey(Integer reportRecordId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_report
     *
     * @mbggenerated Fri Aug 19 12:12:59 CST 2016
     */
    int insert(ReportRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_report
     *
     * @mbggenerated Fri Aug 19 12:12:59 CST 2016
     */
    int insertSelective(ReportRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_report
     *
     * @mbggenerated Fri Aug 19 12:12:59 CST 2016
     */
    ReportRecord selectByPrimaryKey(Integer reportRecordId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_report
     *
     * @mbggenerated Fri Aug 19 12:12:59 CST 2016
     */
    int updateByPrimaryKeySelective(ReportRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_report
     *
     * @mbggenerated Fri Aug 19 12:12:59 CST 2016
     */
    int updateByPrimaryKey(ReportRecord record);

	int countReportedTimes(String reportedID);
}