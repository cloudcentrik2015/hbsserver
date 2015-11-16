package net.cloudcentrik.hbs;

import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerMapper implements ResultSetMapper<Customer> {

	public Customer map(int index, ResultSet rs,
			StatementContext statementContext) throws SQLException {
		return new Customer(rs.getString("customer_user_name"),
				rs.getString("customer_password"),
				rs.getString("customer_email"),
				rs.getString("customer_first_name"),
				rs.getString("customer_last_name"), rs.getInt("customer_age"),
				rs.getString("customer_sex"), rs.getString("customer_phone"),
				rs.getString("customer_address"),
				rs.getInt("customer_postcode"), rs.getString("customer_city"));
	}

}
