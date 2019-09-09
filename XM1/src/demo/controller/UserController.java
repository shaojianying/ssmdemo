package demo.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import demo.main.User;
import demo.main.Yuangong;
import demo.mapper.ActionDao;
import demo.mapper.Jiekou;

@Controller//处理器
public class UserController {
	@Resource(name="usersxl")//引用到接口实现类的资源
	private Jiekou jiek;//接口对象
	@Resource(name="changku2")//引用到action操作接口资源
	private ActionDao ad;//操作接口对象
	@RequestMapping("longin")
	public ModelAndView denglu(Yuangong yg) {//Yuangong yg 由请求页传过来的数据封装成一个员工对象
		String path="success";//登陆成功跳转的页面
		System.out.println("****"+path);//看进方法了没有
		ModelAndView mv=new ModelAndView();
		Yuangong y=jiek.longin(yg);
		if(y==null) {
			path="index";//登陆失败页面
			System.out.println("失败***页面");
		}
		List ls=ad.selectAllaction();
		mv.addObject("actions",ls);
		mv.setViewName(path);//成功页面
		return mv;	
	}
	@RequestMapping("suoyouyonghu")
	public 	ModelAndView textdemo() {
		ModelAndView mv=new ModelAndView("newjc");//跳转newjc.jsp界面	
		//System.out.println(jiek.selectAllUser());
		mv.addObject("yh",jiek.selectAllUser());//得到一个经历了SQL语句的user对象	
		return mv;
	}
	@RequestMapping("tianjiayonghu")//添加用户
	public 	ModelAndView tianjia(User user){
		jiek.addUser(user);
		ModelAndView mv=new ModelAndView("newjc");//跳转newjc.jsp界面	
		mv.addObject("yh",jiek.selectAllUser());//得到一个经历了SQL语句的user对象	
		return mv;
	}
	@RequestMapping("shanchuyonghu")//删除用户
	public 	ModelAndView shanchu(int xuhao) {
		jiek.deleteUser(xuhao);
		ModelAndView mv=new ModelAndView("newjc");//跳转newjc.jsp界面	
		mv.addObject("yh",jiek.selectAllUser());//得到一个经历了SQL语句的user对象	
		return mv;
	}
	@RequestMapping("xiugaiyonghu")
	public 	ModelAndView xiugai(User user) {
		jiek.updateUser(user);
		ModelAndView mv=new ModelAndView("newjc");//跳转newjc.jsp界面	
		mv.addObject("yh",jiek.selectAllUser());//得到一个经历了SQL语句的user对象	
		return mv;
	}
}
