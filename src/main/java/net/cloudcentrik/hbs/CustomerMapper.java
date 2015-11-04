package net.cloudcentrik.hbs;

import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerMapper implements ResultSetMapper<Customer> {

	public Customer map(int index, ResultSet rs, StatementContext statementContext) throws SQLException {
		return new Customer(rs.getInt("customer_user_id"),rs.getInt("customer_age"),rs.getString("customer_sex"),rs.getString("customer_phone"));
	}

}
