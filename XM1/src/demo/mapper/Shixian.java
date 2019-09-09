package demo.mapper;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import demo.main.User;
import demo.main.Yuangong;
//用于实现类
@Service("usersxl")
public class Shixian implements Jiekou {
	@Resource(name="changku")//引入接口资源
	public Jiekou jk;//接口对象
	@Override
	public List selectAllUser() {
		
		return jk.selectAllUser();
	}
	@Override
	public User addUser(User user) {//添加用户
		return jk.addUser(user);
	}
	@Override
	public User deleteUser(int xuhao) {//删除指定用户
		return jk.deleteUser(xuhao);
	}
	@Override
	public User updateUser( User user) {
		System.out.println("sfaa");
		System.out.println(user);
		return jk.updateUser(user);
	}
	@Override
	public Yuangong longin(Yuangong yg) {
		System.out.println("实现类了");
		return jk.longin(yg);
	}

}
