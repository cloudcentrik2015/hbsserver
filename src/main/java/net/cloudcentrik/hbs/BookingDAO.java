package net.cloudcentrik.hbs;

import java.sql.Time;
import java.util.Date;
import java.util.List;

import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.BindBean;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;
import org.skife.jdbi.v2.sqlobject.customizers.RegisterMapper;

@RegisterMapper(BookingMapper.class)
interface BookingDAO {

	@SqlQuery("select * from hbs_booking")
	List<Booking> getAll();

	@SqlQuery("select * from hbs_booking where customer_email = :email")
	Booking findByCustomerEmail(@Bind("email") String email);

	@SqlUpdate("delete from hbs_booking where customer_email = :email")
	int deleteByCustomerEmail(@Bind("email") String email);

	@SqlUpdate("update hbs_booking set shop_email = :shopEmail, customer_email = :customerEmail, booking_date = :bookingDate, booking_start_time = :bookingStartTime, booking_end_time = :bookingEndTime where customer_email = :customerEmail")
	int update(@BindBean Booking booking);

	@SqlUpdate("insert into hbs_booking (shop_email, customer_email, booking_date, booking_start_time, booking_end_time) values (:shopEmail, :customerEmail, :bookingDate, :bookingStartTime, :bookingEndTime)")
	int insert(@BindBean Booking booking);

}
