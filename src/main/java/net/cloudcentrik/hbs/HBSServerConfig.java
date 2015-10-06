package net.cloudcentrik.hbs;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.dropwizard.Configuration;
import io.dropwizard.db.DataSourceFactory;

public class HBSServerConfig extends Configuration {

	@NotEmpty
	private String version;

	@Valid
	@NotNull
	@JsonProperty
	private DataSourceFactory database = new DataSourceFactory();

	@JsonProperty("database")
	public DataSourceFactory getDataSourceFactory() {
		return database;
	}

	@JsonProperty
	public String getVersion() {
		return version;
	}

	@JsonProperty
	public void setVersion(String version) {
		this.version = version;
	}

}
