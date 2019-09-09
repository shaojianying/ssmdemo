package demo.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import demo.main.User;
import demo.main.Yuangong;
//接口的方法可以直接调用UserMapper.xml文件中的标签id相同的sql语句
@Repository("changku")//仓库
public interface Jiekou {
	List selectAllUser();//查询所有用户
	User addUser(User user);
	User deleteUser(int xuhao);
	User updateUser(User user);
	Yuangong longin(Yuangong yg);//登陆方法(判断是否存在此用户)
}
