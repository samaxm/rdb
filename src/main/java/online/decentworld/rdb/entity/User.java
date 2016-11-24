package online.decentworld.rdb.entity;

public class User {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.id
     *
     * @mbggenerated Mon Nov 07 20:19:07 CST 2016
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.unionid
     *
     * @mbggenerated Mon Nov 07 20:19:07 CST 2016
     */
    private String unionid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.openid
     *
     * @mbggenerated Mon Nov 07 20:19:07 CST 2016
     */
    private String openid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.icon
     *
     * @mbggenerated Mon Nov 07 20:19:07 CST 2016
     */
    private String icon;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.name
     *
     * @mbggenerated Mon Nov 07 20:19:07 CST 2016
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.password
     *
     * @mbggenerated Mon Nov 07 20:19:07 CST 2016
     */
    private String password;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.area
     *
     * @mbggenerated Mon Nov 07 20:19:07 CST 2016
     */
    private String area;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.worth
     *
     * @mbggenerated Mon Nov 07 20:19:07 CST 2016
     */
    private Integer worth;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.sign
     *
     * @mbggenerated Mon Nov 07 20:19:07 CST 2016
     */
    private String sign;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.sex
     *
     * @mbggenerated Mon Nov 07 20:19:07 CST 2016
     */
    private Integer sex;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.phone
     *
     * @mbggenerated Mon Nov 07 20:19:07 CST 2016
     */
    private String phone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.version
     *
     * @mbggenerated Mon Nov 07 20:19:07 CST 2016
     */
    private Integer version;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.type
     *
     * @mbggenerated Mon Nov 07 20:19:07 CST 2016
     */
    private String type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.init
     *
     * @mbggenerated Mon Nov 07 20:19:07 CST 2016
     */
    private Boolean init;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.register_channel
     *
     * @mbggenerated Mon Nov 07 20:19:07 CST 2016
     */
    private String registerChannel;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.account
     *
     * @mbggenerated Mon Nov 07 20:19:07 CST 2016
     */
    private String account;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.account_type
     *
     * @mbggenerated Mon Nov 07 20:19:07 CST 2016
     */
    private String accountType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.pay_password
     *
     * @mbggenerated Mon Nov 07 20:19:07 CST 2016
     */
    private String payPassword;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.canWithdraw
     *
     * @mbggenerated Mon Nov 07 20:19:07 CST 2016
     */
    private Byte canwithdraw;


    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.tag
     *
     * @mbggenerated Thu Nov 24 18:03:32 CST 2016
     */
    private String tag;



    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.id
     *
     * @return the value of user.id
     *
     * @mbggenerated Mon Nov 07 20:19:07 CST 2016
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.id
     *
     * @param id the value for user.id
     *
     * @mbggenerated Mon Nov 07 20:19:07 CST 2016
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.unionid
     *
     * @return the value of user.unionid
     *
     * @mbggenerated Mon Nov 07 20:19:07 CST 2016
     */
    public String getUnionid() {
        return unionid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.unionid
     *
     * @param unionid the value for user.unionid
     *
     * @mbggenerated Mon Nov 07 20:19:07 CST 2016
     */
    public void setUnionid(String unionid) {
        this.unionid = unionid == null ? null : unionid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.openid
     *
     * @return the value of user.openid
     *
     * @mbggenerated Mon Nov 07 20:19:07 CST 2016
     */
    public String getOpenid() {
        return openid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.openid
     *
     * @param openid the value for user.openid
     *
     * @mbggenerated Mon Nov 07 20:19:07 CST 2016
     */
    public void setOpenid(String openid) {
        this.openid = openid == null ? null : openid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.icon
     *
     * @return the value of user.icon
     *
     * @mbggenerated Mon Nov 07 20:19:07 CST 2016
     */
    public String getIcon() {
        return icon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.icon
     *
     * @param icon the value for user.icon
     *
     * @mbggenerated Mon Nov 07 20:19:07 CST 2016
     */
    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.name
     *
     * @return the value of user.name
     *
     * @mbggenerated Mon Nov 07 20:19:07 CST 2016
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.name
     *
     * @param name the value for user.name
     *
     * @mbggenerated Mon Nov 07 20:19:07 CST 2016
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.password
     *
     * @return the value of user.password
     *
     * @mbggenerated Mon Nov 07 20:19:07 CST 2016
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.password
     *
     * @param password the value for user.password
     *
     * @mbggenerated Mon Nov 07 20:19:07 CST 2016
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.area
     *
     * @return the value of user.area
     *
     * @mbggenerated Mon Nov 07 20:19:07 CST 2016
     */
    public String getArea() {
        return area;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.area
     *
     * @param area the value for user.area
     *
     * @mbggenerated Mon Nov 07 20:19:07 CST 2016
     */
    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.worth
     *
     * @return the value of user.worth
     *
     * @mbggenerated Mon Nov 07 20:19:07 CST 2016
     */
    public Integer getWorth() {
        return worth;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.worth
     *
     * @param worth the value for user.worth
     *
     * @mbggenerated Mon Nov 07 20:19:07 CST 2016
     */
    public void setWorth(Integer worth) {
        this.worth = worth;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.sign
     *
     * @return the value of user.sign
     *
     * @mbggenerated Mon Nov 07 20:19:07 CST 2016
     */
    public String getSign() {
        return sign;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.sign
     *
     * @param sign the value for user.sign
     *
     * @mbggenerated Mon Nov 07 20:19:07 CST 2016
     */
    public void setSign(String sign) {
        this.sign = sign == null ? null : sign.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.sex
     *
     * @return the value of user.sex
     *
     * @mbggenerated Mon Nov 07 20:19:07 CST 2016
     */
    public Integer getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.sex
     *
     * @param sex the value for user.sex
     *
     * @mbggenerated Mon Nov 07 20:19:07 CST 2016
     */
    public void setSex(Integer sex) {
        this.sex = sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.phone
     *
     * @return the value of user.phone
     *
     * @mbggenerated Mon Nov 07 20:19:07 CST 2016
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.phone
     *
     * @param phone the value for user.phone
     *
     * @mbggenerated Mon Nov 07 20:19:07 CST 2016
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.version
     *
     * @return the value of user.version
     *
     * @mbggenerated Mon Nov 07 20:19:07 CST 2016
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.version
     *
     * @param version the value for user.version
     *
     * @mbggenerated Mon Nov 07 20:19:07 CST 2016
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.type
     *
     * @return the value of user.type
     *
     * @mbggenerated Mon Nov 07 20:19:07 CST 2016
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.type
     *
     * @param type the value for user.type
     *
     * @mbggenerated Mon Nov 07 20:19:07 CST 2016
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.init
     *
     * @return the value of user.init
     *
     * @mbggenerated Mon Nov 07 20:19:07 CST 2016
     */
    public Boolean getInit() {
        return init;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.init
     *
     * @param init the value for user.init
     *
     * @mbggenerated Mon Nov 07 20:19:07 CST 2016
     */
    public void setInit(Boolean init) {
        this.init = init;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.register_channel
     *
     * @return the value of user.register_channel
     *
     * @mbggenerated Mon Nov 07 20:19:07 CST 2016
     */
    public String getRegisterChannel() {
        return registerChannel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.register_channel
     *
     * @param registerChannel the value for user.register_channel
     *
     * @mbggenerated Mon Nov 07 20:19:07 CST 2016
     */
    public void setRegisterChannel(String registerChannel) {
        this.registerChannel = registerChannel == null ? null : registerChannel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.account
     *
     * @return the value of user.account
     *
     * @mbggenerated Mon Nov 07 20:19:07 CST 2016
     */
    public String getAccount() {
        return account;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.account
     *
     * @param account the value for user.account
     *
     * @mbggenerated Mon Nov 07 20:19:07 CST 2016
     */
    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.account_type
     *
     * @return the value of user.account_type
     *
     * @mbggenerated Mon Nov 07 20:19:07 CST 2016
     */
    public String getAccountType() {
        return accountType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.account_type
     *
     * @param accountType the value for user.account_type
     *
     * @mbggenerated Mon Nov 07 20:19:07 CST 2016
     */
    public void setAccountType(String accountType) {
        this.accountType = accountType == null ? null : accountType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.pay_password
     *
     * @return the value of user.pay_password
     *
     * @mbggenerated Mon Nov 07 20:19:07 CST 2016
     */
    public String getPayPassword() {
        return payPassword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.pay_password
     *
     * @param payPassword the value for user.pay_password
     *
     * @mbggenerated Mon Nov 07 20:19:07 CST 2016
     */
    public void setPayPassword(String payPassword) {
        this.payPassword = payPassword == null ? null : payPassword.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.canWithdraw
     *
     * @return the value of user.canWithdraw
     *
     * @mbggenerated Mon Nov 07 20:19:07 CST 2016
     */
    public Byte getCanwithdraw() {
        return canwithdraw;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.canWithdraw
     *
     * @param canwithdraw the value for user.canWithdraw
     *
     * @mbggenerated Mon Nov 07 20:19:07 CST 2016
     */
    public void setCanwithdraw(Byte canwithdraw) {
        this.canwithdraw = canwithdraw;
    }

    public User() {}

    public User(String id, String unionid, String openid, String icon, String name, String password, String area, Integer worth, String sign, Integer sex, String phone, Integer version, String type, Boolean init, String registerChannel, String account, String accountType, String payPassword, Byte canwithdraw) {
        this.id = id;
        this.unionid = unionid;
        this.openid = openid;
        this.icon = icon;
        this.name = name;
        this.password = password;
        this.area = area;
        this.worth = worth;
        this.sign = sign;
        this.sex = sex;
        this.phone = phone;
        this.version = version;
        this.type = type;
        this.init = init;
        this.registerChannel = registerChannel;
        this.account = account;
        this.accountType = accountType;
        this.payPassword = payPassword;
        this.canwithdraw = canwithdraw;
        this.tag=null;
    }

    public User(String id, String unionid, String openid, String icon, String name, String password, String area, Integer worth, String sign, Integer sex, String phone, Integer version, String type, Boolean init, String registerChannel, String account, String accountType, String payPassword, Byte canwithdraw,String tag) {
        this.id = id;
        this.unionid = unionid;
        this.openid = openid;
        this.icon = icon;
        this.name = name;
        this.password = password;
        this.area = area;
        this.worth = worth;
        this.sign = sign;
        this.sex = sex;
        this.phone = phone;
        this.version = version;
        this.type = type;
        this.init = init;
        this.registerChannel = registerChannel;
        this.account = account;
        this.accountType = accountType;
        this.payPassword = payPassword;
        this.canwithdraw = canwithdraw;
        this.tag=tag;
    }


    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
}