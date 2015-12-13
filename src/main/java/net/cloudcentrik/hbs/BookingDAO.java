package net.cloudcentrik.hbs;

import java.util.List;

import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.customizers.RegisterMapper;

@RegisterMapper(BookingMapper.class)
interface BookingDAO {
	
	@SqlQuery("select * from hbs_booking")
	List<Booking> getAll();
	

}
