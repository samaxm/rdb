package online.decentworld.rdb.entity;

public class Wealth {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_wealth.dwID
     *
     * @mbggenerated Mon Aug 29 17:16:37 CST 2016
     */
    private String dwid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_wealth.wealth
     *
     * @mbggenerated Mon Aug 29 17:16:37 CST 2016
     */
    private Integer wealth;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_wealth.dwID
     *
     * @return the value of t_wealth.dwID
     *
     * @mbggenerated Mon Aug 29 17:16:37 CST 2016
     */
    public String getDwid() {
        return dwid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_wealth.dwID
     *
     * @param dwid the value for t_wealth.dwID
     *
     * @mbggenerated Mon Aug 29 17:16:37 CST 2016
     */
    public void setDwid(String dwid) {
        this.dwid = dwid == null ? null : dwid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_wealth.wealth
     *
     * @return the value of t_wealth.wealth
     *
     * @mbggenerated Mon Aug 29 17:16:37 CST 2016
     */
    public Integer getWealth() {
        return wealth;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_wealth.wealth
     *
     * @param wealth the value for t_wealth.wealth
     *
     * @mbggenerated Mon Aug 29 17:16:37 CST 2016
     */
    public void setWealth(Integer wealth) {
        this.wealth = wealth;
    }





}