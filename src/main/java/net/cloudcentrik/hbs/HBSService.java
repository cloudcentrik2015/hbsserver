package net.cloudcentrik.hbs;

import javax.inject.Singleton;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Singleton
@Path("/")
//@Produces({ MediaType.TEXT_PLAIN })
@Produces({ MediaType.APPLICATION_JSON })
public class HBSService {

	public HBSService() {
		//
	}

	/*@GET
	public String run() {
		return "HBS Server running on port 9000";
	}*/
	
	@GET
	public ServerInfo run() {
		return ServerInfo.getServerInfo();
	}

}
