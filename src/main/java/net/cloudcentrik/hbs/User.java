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
	private String mobil;

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

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobil() {
		return mobil;
	}

	public void setMobil(String mobil) {
		this.mobil = mobil;
	}

	public User() {
	}

	public User(int id, String name, String email, String mobile) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.mobil = mobile;
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
		return true;
	}

}
