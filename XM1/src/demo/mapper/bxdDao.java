package demo.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import demo.main.bxd;

//报销单接口
@Repository("changku3")
public interface bxdDao {
	bxd addlbxd(bxd b);//添加报销单
	List<bxd> selectbxd();//查询所有报销单
	List<bxd> selectbxdbyzhuangtai();//查询经理需要审批的报销单
	bxd updatebxdbyid(bxd isbxd);//修改经理指定批示的报销单
	bxd selectbxdbybxid(int bxid);//查找经理选择操作的单个报销单
}
