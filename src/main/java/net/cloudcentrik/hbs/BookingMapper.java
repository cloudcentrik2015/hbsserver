package net.cloudcentrik.hbs;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;

public class BookingMapper implements ResultSetMapper<Booking> {
	
	public Booking map(int index, ResultSet rs,
			StatementContext statementContext) throws SQLException {
		return new Booking(rs.getString("shop_email"),
				rs.getString("customer_email"),
				rs.getDate("booking_date"),
				rs.getTime("booking_start_time"),
				rs.getTime("booking_end_time"));
	}

}
