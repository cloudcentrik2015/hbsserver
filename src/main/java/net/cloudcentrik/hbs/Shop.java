package net.cloudcentrik.hbs;

public class Shop {
	
	private String shopUserName;
	private String shopPassword;
	private String shopEmail;
	private String shopName;
	private String shopAddress;
	private int shopPostcode;
	private String shopCity;
	private String shopPhone;
	private String shopMobile;
	private String shopOpeningHours;
	private int shopHourlyRate;
	
	public Shop(String shopUserName, String shopPassword, String shopEmail,
			String shopName, String shopAddress, int shopPostcode,
			String shopCity, String shopPhone, String shopMobile,
			String shopOpeningHours, int shopHourlyRate) {
		super();
		this.shopUserName = shopUserName;
		this.shopPassword = shopPassword;
		this.shopEmail = shopEmail;
		this.shopName = shopName;
		this.shopAddress = shopAddress;
		this.shopPostcode = shopPostcode;
		this.shopCity = shopCity;
		this.shopPhone = shopPhone;
		this.shopMobile = shopMobile;
		this.shopOpeningHours = shopOpeningHours;
		this.shopHourlyRate = shopHourlyRate;
	}

	public Shop() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getShopUserName() {
		return shopUserName;
	}

	public void setShopUserName(String shopUserName) {
		this.shopUserName = shopUserName;
	}

	public String getShopPassword() {
		return shopPassword;
	}

	public void setShopPassword(String shopPassword) {
		this.shopPassword = shopPassword;
	}

	public String getShopEmail() {
		return shopEmail;
	}

	public void setShopEmail(String shopEmail) {
		this.shopEmail = shopEmail;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getShopAddress() {
		return shopAddress;
	}

	public void setShopAddress(String shopAddress) {
		this.shopAddress = shopAddress;
	}

	public int getShopPostcode() {
		return shopPostcode;
	}

	public void setShopPostcode(int shopPostcode) {
		this.shopPostcode = shopPostcode;
	}

	public String getShopCity() {
		return shopCity;
	}

	public void setShopCity(String shopCity) {
		this.shopCity = shopCity;
	}

	public String getShopPhone() {
		return shopPhone;
	}

	public void setShopPhone(String shopPhone) {
		this.shopPhone = shopPhone;
	}

	public String getShopMobile() {
		return shopMobile;
	}

	public void setShopMobile(String shopMobile) {
		this.shopMobile = shopMobile;
	}

	public String getShopOpeningHours() {
		return shopOpeningHours;
	}

	public void setShopOpeningHours(String shopOpeningHours) {
		this.shopOpeningHours = shopOpeningHours;
	}

	public int getShopHourlyRate() {
		return shopHourlyRate;
	}

	public void setShopHourlyRate(int shopHourlyRate) {
		this.shopHourlyRate = shopHourlyRate;
	}
	
	
	

}
