package online.decentworld.rdb.entity;

public class Joke {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_jokes.id
     *
     * @mbggenerated Thu Aug 18 16:14:16 CST 2016
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_jokes.itemid
     *
     * @mbggenerated Thu Aug 18 16:14:16 CST 2016
     */
    private String itemid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_jokes.content
     *
     * @mbggenerated Thu Aug 18 16:14:16 CST 2016
     */
    private String content;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_jokes.id
     *
     * @return the value of t_jokes.id
     *
     * @mbggenerated Thu Aug 18 16:14:16 CST 2016
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_jokes.id
     *
     * @param id the value for t_jokes.id
     *
     * @mbggenerated Thu Aug 18 16:14:16 CST 2016
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_jokes.itemid
     *
     * @return the value of t_jokes.itemid
     *
     * @mbggenerated Thu Aug 18 16:14:16 CST 2016
     */
    public String getItemid() {
        return itemid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_jokes.itemid
     *
     * @param itemid the value for t_jokes.itemid
     *
     * @mbggenerated Thu Aug 18 16:14:16 CST 2016
     */
    public void setItemid(String itemid) {
        this.itemid = itemid == null ? null : itemid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_jokes.content
     *
     * @return the value of t_jokes.content
     *
     * @mbggenerated Thu Aug 18 16:14:16 CST 2016
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_jokes.content
     *
     * @param content the value for t_jokes.content
     *
     * @mbggenerated Thu Aug 18 16:14:16 CST 2016
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}