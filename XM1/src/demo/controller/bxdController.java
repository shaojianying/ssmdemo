package demo.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.test.web.ModelAndViewAssert;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import demo.main.bxd;
import demo.mapper.bxdDao;



@Controller//报销单处理器
public class bxdController {
	@Resource(name="changku3")//引用到报销单接口实现类的资源
	private bxdDao bdd;//接口对象
	@RequestMapping("tianjiabx")//添加报销单	
	public 	String addbaoxiao(bxd b) {
		bdd.addlbxd(b);
		return "redirect:chaxunsuoyou";//跳转到查询所有报销单的方法
	}
	@RequestMapping("chaxunsuoyou")//查询所有的报销单
	public ModelAndView selectbaoxiao() {
		ModelAndView mv=new ModelAndView();
		mv.addObject("bxds",bdd.selectbxd());
		mv.setViewName("suoyoubxd");
		return mv;
	}
	@RequestMapping("jinglishengpi")//查询经理要批示的报销单
	public ModelAndView selectjingli() {
		ModelAndView mv=new ModelAndView();
		mv.addObject("bxds",bdd.selectbxdbyzhuangtai());
		mv.setViewName("jinglicaozuo");
		return mv;
	}
	@RequestMapping("pishibaoxiaodan")//查询经理指定操作要批示的单个报销单
	public ModelAndView selectbxdbybxid(int bxid) {
		ModelAndView mv=new ModelAndView();
		mv.addObject("czbxd",bdd.selectbxdbybxid(bxid));
		mv.setViewName("spbxd");
		return mv;
	}
	@RequestMapping("xiugaijinglipishibxd")//修改经理批示的报销单
	public String updatebxdbyjingli(int bxid,int bxzhuangtai) {
		System.out.println(bxid);
		System.out.println(bxzhuangtai);
		String jingliyijian="";
		if(bxzhuangtai==2) {
			jingliyijian="同意";
		}else if(bxzhuangtai==3) {
			jingliyijian="不同意";
		}
		bxd isbxd=new bxd(bxid,bxzhuangtai);
		isbxd.setJingliyijian(jingliyijian);	
		bdd.updatebxdbyid(isbxd);
		return "redirect:jinglishengpi";
	}
}
