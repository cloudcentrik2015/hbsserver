package net.cloudcentrik.hbs;

import javax.validation.Valid;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import com.codahale.metrics.annotation.Timed;

import java.util.List;

@Path("/User")
@Consumes({ MediaType.APPLICATION_JSON })
@Produces({ MediaType.APPLICATION_JSON })
public class UserResource {

	UserDAO userDAO;

	public UserResource(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	@GET
	@Timed
	@Path("/all")
	@Produces(MediaType.APPLICATION_JSON)
	public List<User> getAll() {
		return userDAO.getAll();
	}

	@GET
	@Path("/{email}")
	@Produces(MediaType.APPLICATION_JSON)
	public User get(@PathParam("email") String email) {
		User u=userDAO.findByEmail(email);
		//return userDAO.findByEmail(email);
		if(u==null){
			return new User();
		}else{
			return u;
		}
			
	}

	@POST
	public User add(@Valid User user) {
		int id = userDAO.insert(user);
		if (id > 0) {
			return userDAO.findByEmail(user.getUserEmail());
		} else {
			return new User();
		}
	}

	@PUT
	@Path("/{email}")
	public User update(@PathParam("userEmail") String email, @Valid User user) {
		user.setUserEmail(email);
		int id=userDAO.update(user);
		if (id > 0) {
			return userDAO.findByEmail(user.getUserEmail());
		} else {
			return new User();
		}
	}

	@DELETE
	@Path("/{email}")
	public int delete(@PathParam("email") String email) {
		int id=userDAO.deleteByEmail(email);
		return id;
	}

}
