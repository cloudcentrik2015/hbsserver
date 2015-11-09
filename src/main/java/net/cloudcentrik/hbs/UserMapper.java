package net.cloudcentrik.hbs;

import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserMapper implements ResultSetMapper<User> {

	public User map(int index, ResultSet rs, StatementContext statementContext) throws SQLException {
		return new User(rs.getString("user_name"),rs.getString("user_password"),rs.getString("user_email"),rs.getString("user_type"));
	}
	

}
