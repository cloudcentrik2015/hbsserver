package net.cloudcentrik.hbs;

import java.util.List;

import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.BindBean;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;
import org.skife.jdbi.v2.sqlobject.customizers.RegisterMapper;

@RegisterMapper(ShopMapper.class)
public interface ShopDAO {
	@SqlQuery("select * from hbs_shop")
	List<Shop> getAll();

	@SqlQuery("select * from hbs_shop where shop_email = :email")
	Shop findByEmail(@Bind("shopEmail") String email);

	@SqlUpdate("delete from hbs_shop where shop_email = :email")
	int deleteByEmail(@Bind("email") String email);

	/*
	 * @SqlUpdate(
	 * "update hbs_customer set customer_user_name = :customerUserName,customer_password = :customerPassword, customer_email = :customerEmail,customer_first_name = :customerFirstName,customer_last_name = :customerLastName, customer_age = :customerAge, customer_sex = :customerSex, customer_phone = :customerPhone,,customer_address = :customerAdress, customer_postcode = :customerPostCode, customer_city = :customerCity"
	 * ) int update(@BindBean Customer customer);
	 * 
	 * @SqlUpdate(
	 * "insert into hbs_customer (customer_user_name, customer_password, customer_email,customer_first_name,customer_last_name,customer_age,customer_sex, customer_phone,customer_address,customer_postcode,customer_city) values (:customerUserName, :customerPassword, :customerEmail,:customerFirstName, :customerLastName, :customerAge, :customerSex, :customerPhone,:customerAdress, :customerPostCode, :customerCity)"
	 * ) int insert(@BindBean Customer customer);
	 * 
	 * //select * from hbs_customer where customer_user_name= 'test' AND
	 * customer_password= 'test';
	 * 
	 * @SqlQuery(
	 * "select * from hbs_customer where customer_user_name = :customerUserName and customer_password = :customerPassword"
	 * ) Customer findCustomer(@Bind("customerUserName") String
	 * customerUserName,@Bind("customerPassword") String customerPassword);
	 */
}
