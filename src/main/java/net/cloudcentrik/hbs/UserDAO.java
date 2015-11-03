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

	@SqlQuery("select * from hbs_user where user_id = :id")
	User findById(@Bind("id") int id);

	@SqlUpdate("delete from hbs_user where user_id = :id")
	int deleteById(@Bind("id") int id);

	@SqlUpdate("update hbs_user set user_name = :userName, passward = :passward, user_email = :email, user_type = :type, user_first_name = :firstName , user_last_name = :lastName where U_id = :id")
	int update(@BindBean User user);

	@SqlUpdate("insert into hbs_user (user_name, passward, user_email, user_type, user_first_name, user_last_name) values (:userName, :passward, :email, :type, :firstName, :lastName)")
	int insert(@BindBean User user);

}
