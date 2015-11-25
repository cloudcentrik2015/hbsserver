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
	public Customer get(@PathParam("email") String email) {
		return customerDAO.findByEmail(email);
	}

	@POST
	public Customer add(@Valid Customer customer) {
		customerDAO.insert(customer);
		return customer;
	}

	@PUT
	@Path("/{email}")
	public Customer update(@PathParam("email") String email,
			@Valid Customer customer) {
		customerDAO.update(customer);
		return customer;
	}

	@DELETE
	@Path("/{email}")
	public int delete(@PathParam("email") String email) {
		return customerDAO.deleteByEmail(email);
	}
	
	@POST
	@Path("/signin")
	public Customer signin(@Valid Customer customer) {
		
		Customer c=customerDAO.findCustomer(customer.getCustomerUserName(), customer.getCustomerPassword());
		
		if(c==null){
			return new Customer();  
		}else{
			return c;
		}
		
	}

}
