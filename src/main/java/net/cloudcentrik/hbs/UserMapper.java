package net.cloudcentrik.hbs;

import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserMapper implements ResultSetMapper<User> {

	public User map(int index, ResultSet resultSet, StatementContext statementContext) throws SQLException {
		return new User().setId(resultSet.getInt("U_id")).setName(resultSet.getString("Name"));
	}

}
