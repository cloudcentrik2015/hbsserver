package net.cloudcentrik.hbs;

import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.BindBean;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;
import org.skife.jdbi.v2.sqlobject.customizers.RegisterMapper;
import java.util.List;
@RegisterMapper(UserMapper.class)
interface UserDAO {
	
	@SqlQuery("select * from Users")
	List<User> getAll();
	@SqlQuery("select * from Users where U_id = :id")
	User findById(@Bind("id") int id);
	@SqlUpdate("delete from Users where U_id = :id")
	int deleteById(@Bind("id") int id);
	@SqlUpdate("update into Users set Name = :name where U_id = :id")
	int update(@BindBean User user);
	@SqlUpdate("insert into Users (U_Id, Name) values (:id, :name)")
	int insert(@BindBean User user);

}
