package net.cloudcentrik.hbs;

import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserMapper implements ResultSetMapper<User> {

	public User map(int index, ResultSet rs, StatementContext statementContext) throws SQLException {
		return new User(rs.getInt("user_id"),rs.getString("user_name"),rs.getString("passward"),rs.getString("user_email"),rs.getString("user_type"),rs.getString("user_first_name"),rs.getString("user_last_name"));
	}
	

}
