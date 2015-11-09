package net.cloudcentrik.hbs;

import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.BindBean;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;
import org.skife.jdbi.v2.sqlobject.customizers.RegisterMapper;
import java.util.List;

@RegisterMapper(UserMapper.class)
interface UserDAO {

	@SqlQuery("select * from hbs_user")
	List<User> getAll();

	@SqlQuery("select * from hbs_user where user_email = :email")
	User findByEmail(@Bind("email") String email);

	@SqlUpdate("delete from hbs_user where user_email = :email")
	int deleteByEmail(@Bind("userEmail") String email);

	@SqlUpdate("update hbs_user set user_name = :userName, user_password = :userPassword, user_type = :userType where user_email = :userEmail")
	int update(@BindBean User user);

	@SqlUpdate("insert into hbs_user (user_name, user_password, user_email, user_type) values (:userName, :userPassword, :userEmail, :userType)")
	int insert(@BindBean User user);

}
