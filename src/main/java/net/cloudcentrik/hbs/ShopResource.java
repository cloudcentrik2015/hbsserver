package net.cloudcentrik.hbs;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.codahale.metrics.annotation.Timed;

@Path("/Shop")
@Consumes({ MediaType.APPLICATION_JSON })
@Produces({ MediaType.APPLICATION_JSON })
public class ShopResource {
	
	ShopDAO shopDAO;

	public ShopResource(ShopDAO shopDAO) {
		this.shopDAO = shopDAO;
	}

	@GET
	@Timed
	@Path("/all")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Shop> getAll() {
		return shopDAO.getAll();
	}

}
