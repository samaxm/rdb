package online.decentworld.rdb.entity;

import java.util.Date;

public class WorthChangeRecords {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_worth_change_records.id
     *
     * @mbggenerated Thu Nov 24 18:03:32 CST 2016
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_worth_change_records.dwID
     *
     * @mbggenerated Thu Nov 24 18:03:32 CST 2016
     */
    private String dwid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_worth_change_records.time
     *
     * @mbggenerated Thu Nov 24 18:03:32 CST 2016
     */
    private Date time;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_worth_change_records.worth_before
     *
     * @mbggenerated Thu Nov 24 18:03:32 CST 2016
     */
    private Integer worthBefore;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_worth_change_records.worth_after
     *
     * @mbggenerated Thu Nov 24 18:03:32 CST 2016
     */
    private Integer worthAfter;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_worth_change_records.id
     *
     * @return the value of t_worth_change_records.id
     *
     * @mbggenerated Thu Nov 24 18:03:32 CST 2016
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_worth_change_records.id
     *
     * @param id the value for t_worth_change_records.id
     *
     * @mbggenerated Thu Nov 24 18:03:32 CST 2016
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_worth_change_records.dwID
     *
     * @return the value of t_worth_change_records.dwID
     *
     * @mbggenerated Thu Nov 24 18:03:32 CST 2016
     */
    public String getDwid() {
        return dwid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_worth_change_records.dwID
     *
     * @param dwid the value for t_worth_change_records.dwID
     *
     * @mbggenerated Thu Nov 24 18:03:32 CST 2016
     */
    public void setDwid(String dwid) {
        this.dwid = dwid == null ? null : dwid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_worth_change_records.time
     *
     * @return the value of t_worth_change_records.time
     *
     * @mbggenerated Thu Nov 24 18:03:32 CST 2016
     */
    public Date getTime() {
        return time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_worth_change_records.time
     *
     * @param time the value for t_worth_change_records.time
     *
     * @mbggenerated Thu Nov 24 18:03:32 CST 2016
     */
    public void setTime(Date time) {
        this.time = time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_worth_change_records.worth_before
     *
     * @return the value of t_worth_change_records.worth_before
     *
     * @mbggenerated Thu Nov 24 18:03:32 CST 2016
     */
    public Integer getWorthBefore() {
        return worthBefore;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_worth_change_records.worth_before
     *
     * @param worthBefore the value for t_worth_change_records.worth_before
     *
     * @mbggenerated Thu Nov 24 18:03:32 CST 2016
     */
    public void setWorthBefore(Integer worthBefore) {
        this.worthBefore = worthBefore;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_worth_change_records.worth_after
     *
     * @return the value of t_worth_change_records.worth_after
     *
     * @mbggenerated Thu Nov 24 18:03:32 CST 2016
     */
    public Integer getWorthAfter() {
        return worthAfter;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_worth_change_records.worth_after
     *
     * @param worthAfter the value for t_worth_change_records.worth_after
     *
     * @mbggenerated Thu Nov 24 18:03:32 CST 2016
     */
    public void setWorthAfter(Integer worthAfter) {
        this.worthAfter = worthAfter;
    }
}