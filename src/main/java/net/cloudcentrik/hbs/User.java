package net.cloudcentrik.hbs;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;

public class User {

	@JsonProperty
	private Integer id;

	@NotNull
	@JsonProperty
	private String userName;

	@NotNull
	@JsonProperty
	private String passward;

	@NotNull
	@JsonProperty
	private String email;

	@NotNull
	@JsonProperty
	private String type;

	@NotNull
	@JsonProperty
	private String firstName;

	@NotNull
	@JsonProperty
	private String lastName;

	public Integer getId() {
		return id;
	}

	public User setId(Integer id) {
		this.id = id;
		return this;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassward() {
		return passward;
	}

	public void setPassward(String passward) {
		this.passward = passward;
	}

	public String getEmail() {
		return email;
	}

	public User setEmail(String email) {
		this.email = email;
		return this;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public User() {
	}

	public User(int id, String userName, String passward, String email,
			String type, String firstName, String lastName) {
		this.id = id;
		this.userName = userName;
		this.passward = passward;
		this.email = email;
		this.type = type;
		this.firstName = firstName;
		this.lastName = lastName;
	}
}
