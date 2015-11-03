package net.cloudcentrik.hbs;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ServerInfo {

	@JsonProperty
	private String message;
	@JsonProperty
	private String date;

	private static ServerInfo serverInfo = new ServerInfo();

	private ServerInfo() {
		message = "Welcome to HBS Restfull API";
		date = new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance()
				.getTime());
	}

	public static ServerInfo getServerInfo() {
		return serverInfo;
	}
}
