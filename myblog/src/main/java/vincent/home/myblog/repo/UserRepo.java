package vincent.home.myblog.repo;

import org.apache.ibatis.annotations.Mapper;

import vincent.home.myblog.entity.User;

@Mapper
public interface UserRepo {
	public User selectFirstUser();
}
