package online.decentworld.rdb.entity;

public class WebGame {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column web_game.id
     *
     * @mbggenerated Wed Mar 08 16:58:56 CST 2017
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column web_game.name
     *
     * @mbggenerated Wed Mar 08 16:58:56 CST 2017
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column web_game.url
     *
     * @mbggenerated Wed Mar 08 16:58:56 CST 2017
     */
    private String url;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column web_game.id
     *
     * @return the value of web_game.id
     *
     * @mbggenerated Wed Mar 08 16:58:56 CST 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column web_game.id
     *
     * @param id the value for web_game.id
     *
     * @mbggenerated Wed Mar 08 16:58:56 CST 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column web_game.name
     *
     * @return the value of web_game.name
     *
     * @mbggenerated Wed Mar 08 16:58:56 CST 2017
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column web_game.name
     *
     * @param name the value for web_game.name
     *
     * @mbggenerated Wed Mar 08 16:58:56 CST 2017
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column web_game.url
     *
     * @return the value of web_game.url
     *
     * @mbggenerated Wed Mar 08 16:58:56 CST 2017
     */
    public String getUrl() {
        return url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column web_game.url
     *
     * @param url the value for web_game.url
     *
     * @mbggenerated Wed Mar 08 16:58:56 CST 2017
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }
}