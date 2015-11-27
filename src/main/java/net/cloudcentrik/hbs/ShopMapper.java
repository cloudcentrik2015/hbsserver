package net.cloudcentrik.hbs;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;

public class ShopMapper implements ResultSetMapper<Shop>  {
	
	public Shop map(int index, ResultSet rs,
			StatementContext statementContext) throws SQLException {
		return new Shop(
				rs.getString("shop_user_name"),
				rs.getString("shop_password"),
				rs.getString("shop_email"),
				rs.getString("shop_name"),
				rs.getString("shop_address"), 
				rs.getInt("shop_postcode"),
				rs.getString("shop_city"),
				rs.getString("shop_phone"), 
				rs.getString("shop_mobile"),
				rs.getString("shop_opening_hours"),
				rs.getInt("shop_hourly_rate")
				);
	}

}
