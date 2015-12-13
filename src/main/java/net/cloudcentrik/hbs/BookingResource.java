package net.cloudcentrik.hbs;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.codahale.metrics.annotation.Timed;

@Path("/Booking")
@Consumes({ MediaType.APPLICATION_JSON })
@Produces({ MediaType.APPLICATION_JSON })
public class BookingResource {
	
	BookingDAO bookingDAO;
	
	public BookingResource(BookingDAO bookingDAO) {
		this.bookingDAO = bookingDAO;
	}
	
	@GET
	@Timed
	@Path("/all")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Booking> getAll() {
		return bookingDAO.getAll();
	}

}
