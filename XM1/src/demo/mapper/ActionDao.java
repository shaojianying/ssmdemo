package demo.mapper;


import java.util.List;

import org.springframework.stereotype.Repository;

import demo.main.Action;
//操作 接口
@Repository("changku2")
public interface ActionDao {
	List<Action> selectAllaction();
}
