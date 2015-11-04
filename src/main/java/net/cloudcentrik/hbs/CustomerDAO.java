package net.cloudcentrik.hbs;

import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.BindBean;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;
import org.skife.jdbi.v2.sqlobject.customizers.RegisterMapper;
import java.util.List;

@RegisterMapper(CustomerMapper.class)
interface CustomerDAO {

	@SqlQuery("select * from hbs_customer")
	List<Customer> getAll();

	@SqlQuery("select * from hbs_customer where customer_user_id = :id")
	Customer findById(@Bind("id") int id);

	@SqlUpdate("delete from hbs_customer where customer_user_id = :id")
	int deleteById(@Bind("id") int id);

	@SqlUpdate("update hbs_customer set customer_age = :age, customer_sex = :sex, customer_phone = :phone")
	int update(@BindBean Customer customer);

	@SqlUpdate("insert into hbs_customer (customer_user_id, customer_age, customer_sex, customer_phone) values (:customerId, :age, :sex, :phone)")
	int insert(@BindBean Customer customer);

}
