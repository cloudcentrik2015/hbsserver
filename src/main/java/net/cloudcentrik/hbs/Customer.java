package net.cloudcentrik.hbs;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Customer {

	@JsonProperty
	private String customerUserName;
	
	@JsonProperty
	private String customerPassword;

	@JsonProperty
	private String customerEmail;
	
	@JsonProperty
	private String customerFirstName;
	
	@JsonProperty
	private String customerLastName;
	
	@JsonProperty
	private int customerAge;
	
	@JsonProperty
	private String customerSex;
	
	@JsonProperty
	private String customerPhone;
	
	@JsonProperty
	private String customerAdress;
	
	@JsonProperty
	private int customerPostCode;
	
	@JsonProperty
	private String customerCity;

	public Customer(String customerUserName, String customerPassword,
			String customerEmail, String customerFirstName,
			String customerLastName, int customerAge, String customerSex,
			String customerPhone, String customerAdress, int customerPostCode,
			String customerCity) {
		super();
		this.customerUserName = customerUserName;
		this.customerPassword = customerPassword;
		this.customerEmail = customerEmail;
		this.customerFirstName = customerFirstName;
		this.customerLastName = customerLastName;
		this.customerAge = customerAge;
		this.customerSex = customerSex;
		this.customerPhone = customerPhone;
		this.customerAdress = customerAdress;
		this.customerPostCode = customerPostCode;
		this.customerCity = customerCity;
	}

	public String getCustomerUserName() {
		return customerUserName;
	}

	public void setCustomerUserName(String customerUserName) {
		this.customerUserName = customerUserName;
	}

	public String getCustomerPassword() {
		return customerPassword;
	}

	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public String getCustomerFirstName() {
		return customerFirstName;
	}

	public void setCustomerFirstName(String customerFirstName) {
		this.customerFirstName = customerFirstName;
	}

	public String getCustomerLastName() {
		return customerLastName;
	}

	public void setCustomerLastName(String customerLastName) {
		this.customerLastName = customerLastName;
	}

	public int getCustomerAge() {
		return customerAge;
	}

	public void setCustomerAge(int customerAge) {
		this.customerAge = customerAge;
	}

	public String getCustomerSex() {
		return customerSex;
	}

	public void setCustomerSex(String customerSex) {
		this.customerSex = customerSex;
	}

	public String getCustomerPhone() {
		return customerPhone;
	}

	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}

	public String getCustomerAdress() {
		return customerAdress;
	}

	public void setCustomerAdress(String customerAdress) {
		this.customerAdress = customerAdress;
	}

	public int getCustomerPostCode() {
		return customerPostCode;
	}

	public void setCustomerPostCode(int customerPostCode) {
		this.customerPostCode = customerPostCode;
	}

	public String getCustomerCity() {
		return customerCity;
	}

	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}
	
	

}
