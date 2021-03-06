package online.decentworld.rdb.entity;

import java.util.Date;


public class ReportRecord {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_report.report_record_id
     *
     * @mbggenerated Fri Aug 19 12:12:59 CST 2016
     */
    private Integer reportRecordId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_report.reporter_user_id
     *
     * @mbggenerated Fri Aug 19 12:12:59 CST 2016
     */
    private String reporterUserId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_report.reported_user_id
     *
     * @mbggenerated Fri Aug 19 12:12:59 CST 2016
     */
    private String reportedUserId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_report.report_time
     *
     * @mbggenerated Fri Aug 19 12:12:59 CST 2016
     */
    private Date reportTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_report.report_reason
     *
     * @mbggenerated Fri Aug 19 12:12:59 CST 2016
     */
    private String reportReason;

    public ReportRecord(String reporterID, String reportedID, String reason) {
    	this.reportedUserId=reportedID;
    	this.reporterUserId=reporterID;
    	this.reportReason=reason;
    	this.reportTime=new Date();
    }

    
    
	public ReportRecord() {
		super();
	}



	/**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_report.report_record_id
     *
     * @return the value of t_report.report_record_id
     *
     * @mbggenerated Fri Aug 19 12:12:59 CST 2016
     */
    public Integer getReportRecordId() {
        return reportRecordId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_report.report_record_id
     *
     * @param reportRecordId the value for t_report.report_record_id
     *
     * @mbggenerated Fri Aug 19 12:12:59 CST 2016
     */
    public void setReportRecordId(Integer reportRecordId) {
        this.reportRecordId = reportRecordId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_report.reporter_user_id
     *
     * @return the value of t_report.reporter_user_id
     *
     * @mbggenerated Fri Aug 19 12:12:59 CST 2016
     */
    public String getReporterUserId() {
        return reporterUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_report.reporter_user_id
     *
     * @param reporterUserId the value for t_report.reporter_user_id
     *
     * @mbggenerated Fri Aug 19 12:12:59 CST 2016
     */
    public void setReporterUserId(String reporterUserId) {
        this.reporterUserId = reporterUserId == null ? null : reporterUserId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_report.reported_user_id
     *
     * @return the value of t_report.reported_user_id
     *
     * @mbggenerated Fri Aug 19 12:12:59 CST 2016
     */
    public String getReportedUserId() {
        return reportedUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_report.reported_user_id
     *
     * @param reportedUserId the value for t_report.reported_user_id
     *
     * @mbggenerated Fri Aug 19 12:12:59 CST 2016
     */
    public void setReportedUserId(String reportedUserId) {
        this.reportedUserId = reportedUserId == null ? null : reportedUserId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_report.report_time
     *
     * @return the value of t_report.report_time
     *
     * @mbggenerated Fri Aug 19 12:12:59 CST 2016
     */
    public Date getReportTime() {
        return reportTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_report.report_time
     *
     * @param reportTime the value for t_report.report_time
     *
     * @mbggenerated Fri Aug 19 12:12:59 CST 2016
     */
    public void setReportTime(Date reportTime) {
        this.reportTime = reportTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_report.report_reason
     *
     * @return the value of t_report.report_reason
     *
     * @mbggenerated Fri Aug 19 12:12:59 CST 2016
     */
    public String getReportReason() {
        return reportReason;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_report.report_reason
     *
     * @param reportReason the value for t_report.report_reason
     *
     * @mbggenerated Fri Aug 19 12:12:59 CST 2016
     */
    public void setReportReason(String reportReason) {
        this.reportReason = reportReason == null ? null : reportReason.trim();
    }
}