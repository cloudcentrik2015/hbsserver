package net.cloudcentrik.hbs;

import java.util.List;

import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
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
	
	@GET
	@Path("/{email}")
	@Produces(MediaType.APPLICATION_JSON)
	public Booking get(@PathParam("email") String email) {
		Booking b=bookingDAO.findByCustomerEmail(email);
		//return userDAO.findByEmail(email);
		if(b==null){
			return new Booking();
		}else{
			return b;
		}
			
	}
	
	@POST
	public Booking add(@Valid Booking booking) {
		int id = bookingDAO.insert(booking);
		if (id > 0) {
			return booking;
		} else {
			return new Booking();
		}
	}

}
