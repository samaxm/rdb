package online.decentworld.rdb.entity;


/**
 * 用户对外基本信息
 * @author Sammax
 *
 */
public class BaseDisplayUserInfo {

	private String dwID;
	
	private Integer sex;
	
	private String name;
	
	private String icon;

	private String area;
	
	private String sign;
	
	private Integer worth;

	private String type;

	private String tag;

	private String age;

	private String title;

	private String company;

	private String star;

	private String realname;

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getStar() {
		return star;
	}

	public void setStar(String star) {
		this.star = star;
	}

	public String getRealname() {
		return realname;
	}

	public void setRealname(String realname) {
		this.realname = realname;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public String getDwID() {
		return dwID;
	}

	public void setDwID(String dwID) {
		this.dwID = dwID;
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

	public Integer getWorth() {
		return worth;
	}

	public void setWorth(Integer worth) {
		this.worth = worth;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public BaseDisplayUserInfo() {

	}

	public BaseDisplayUserInfo(User user) {
		this.setArea(user.getArea());
		this.setDwID(user.getId());
		this.setIcon(user.getIcon());
		this.setSex(user.getSex());
		this.setSign(user.getSign());
		this.setWorth(user.getWorth());
		this.setName(user.getName());
		this.setType(user.getType());
		this.setTag(user.getTag());
		this.setTitle(user.getTitle());
		setAge(user.getAge());
		setCompany(user.getCompany());
		setStar(user.getStar());
		setRealname(user.getRealname());
	}
}
