package net.cloudcentrik.hbs;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;

public class User {

	@NotNull
	@JsonProperty
	private String userName;

	@NotNull
	@JsonProperty
	private String userPassword;

	@NotNull
	@JsonProperty
	private String userEmail;

	@NotNull
	@JsonProperty
	private String userType;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public User(String userName, String userPassword, String userEmail,
			String userType) {
		super();
		this.userName = userName;
		this.userPassword = userPassword;
		this.userEmail = userEmail;
		this.userType = userType;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

}
