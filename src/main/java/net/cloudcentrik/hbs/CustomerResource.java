package net.cloudcentrik.hbs;

import javax.validation.Valid;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import com.codahale.metrics.annotation.Timed;

import java.util.List;

@Path("/Customer")
@Consumes({ MediaType.APPLICATION_JSON })
@Produces({ MediaType.APPLICATION_JSON })
public class CustomerResource {

	CustomerDAO customerDAO;

	public CustomerResource(CustomerDAO customerDAO) {
		this.customerDAO = customerDAO;
	}

	@GET
    @Timed
    @Path("/all")
    @Produces(MediaType.APPLICATION_JSON)
	public List<Customer> getAll() {
		return customerDAO.getAll();
	}

	@GET
	@Path("/{id}")
	 @Produces(MediaType.APPLICATION_JSON)
	public Customer get(@PathParam("id") Integer id) {
		return customerDAO.findById(id);
	}

	@POST
	public Customer add(@Valid Customer customer) {
		int newId = customerDAO.insert(customer);
		customer.setCustomerId(newId);
		return customer;
	}

	@PUT
	@Path("/{id}")
	public Customer update(@PathParam("id") Integer id, @Valid Customer customer) {
		customer.setCustomerId(id);
		customerDAO.update(customer);
		return customer;
	}

	@DELETE
	@Path("/{id}")
	public int delete(@PathParam("id") Integer id) {
		customerDAO.deleteById(id);
		return id;
	}

}
