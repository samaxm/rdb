package online.decentworld.rdb.entity;

public class UserInfo {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user_info.dwID
     *
     * @mbggenerated Wed Aug 17 15:05:22 CST 2016
     */
    private String dwid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user_info.phonenum
     *
     * @mbggenerated Wed Aug 17 15:05:22 CST 2016
     */
    private String phonenum;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user_info.dwID
     *
     * @return the value of t_user_info.dwID
     *
     * @mbggenerated Wed Aug 17 15:05:22 CST 2016
     */
    public String getDwid() {
        return dwid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user_info.dwID
     *
     * @param dwid the value for t_user_info.dwID
     *
     * @mbggenerated Wed Aug 17 15:05:22 CST 2016
     */
    public void setDwid(String dwid) {
        this.dwid = dwid == null ? null : dwid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user_info.phonenum
     *
     * @return the value of t_user_info.phonenum
     *
     * @mbggenerated Wed Aug 17 15:05:22 CST 2016
     */
    public String getPhonenum() {
        return phonenum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user_info.phonenum
     *
     * @param phonenum the value for t_user_info.phonenum
     *
     * @mbggenerated Wed Aug 17 15:05:22 CST 2016
     */
    public void setPhonenum(String phonenum) {
        this.phonenum = phonenum == null ? null : phonenum.trim();
    }
}