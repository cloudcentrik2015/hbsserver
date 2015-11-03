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
	@Path("/{id}")
	 @Produces(MediaType.APPLICATION_JSON)
	public User get(@PathParam("id") Integer id) {
		return userDAO.findById(id);
	}

	@POST
	public User add(@Valid User user) {
		int newId = userDAO.insert(user);
		return user.setId(newId);
	}

	@PUT
	@Path("/{id}")
	public User update(@PathParam("id") Integer id, @Valid User user) {
		user = user.setId(id);
		userDAO.update(user);
		return user;
	}

	@DELETE
	@Path("/{id}")
	public int delete(@PathParam("id") Integer id) {
		userDAO.deleteById(id);
		return id;
	}

}
