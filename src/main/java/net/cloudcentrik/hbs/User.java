package net.cloudcentrik.hbs;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;

public class User {

	@NotNull
	@JsonProperty
	private Integer id;

	@NotNull
	@JsonProperty
	private String name;

	@NotNull
	@JsonProperty
	private String email;

	@NotNull
	@JsonProperty
	private String phone;

	public Integer getId() {
		return id;
	}

	public User setId(Integer id) {
		this.id = id;
		return this;
	}

	public String getName() {
		return name;
	}

	public User setName(String name) {
		this.name = name;
		return this;
	}

	public String getEmail() {
		return email;
	}

	public User setEmail(String email) {
		this.email = email;
		return this;
	}

	public String getPhone() {
		return phone;
	}

	public User setMobil(String phone) {
		this.phone = phone;
		return this;
	}

	public User() {
	}

	public User(int id, String name, String email, String phone) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof User))
			return false;
		User that = (User) o;
		if (!getId().equals(that.getId()))
			return false;
		if (!getName().equals(that.getName()))
			return false;
		if (!getEmail().equals(that.getEmail()))
			return false;
		if (!getPhone().equals(that.getPhone()))
			return false;
		return true;
	}

}
