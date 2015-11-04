package net.cloudcentrik.hbs;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Customer {

	@JsonProperty
	private int customerId;
	@JsonProperty
	private int age;
	@JsonProperty
	private String sex;
	@JsonProperty
	private String phone;

	public Customer(int customerId, int age, String sex, String phone) {
		super();
		this.customerId = customerId;
		this.age = age;
		this.sex = sex;
		this.phone = phone;
	}
	
	public Customer(){
		
	}

	public int getAge() {
		return age;
	}

	public int getCustomerId() {
		return customerId;
	}

	public String getPhone() {
		return phone;
	}

	public String getSex() {
		return sex;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

}
