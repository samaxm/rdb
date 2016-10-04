package online.decentworld.rdb.entity;


/**
 * 用户对外基本信息
 * @author Sammax
 *
 */
public class BaseDisplayUserInfo {

	private String dwID;
	
	private int sex;
	
	private String name;
	
	private String icon;

	private String area;
	
	private String sign;
	
	private int worth;
	
	private int wealth;

	private String type;


	public String getDwID() {
		return dwID;
	}

	public void setDwID(String dwID) {
		this.dwID = dwID;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
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

	public int getWorth() {
		return worth;
	}

	public void setWorth(int worth) {
		this.worth = worth;
	}

	public int getWealth() {
		return wealth;
	}

	public void setWealth(int wealth) {
		this.wealth = wealth;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
