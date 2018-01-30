package cn.kane.travel.system.dao;

import java.util.List;
import java.util.Map;

import cn.kane.travel.common.dao.BaseDao;
import cn.kane.travel.system.entity.Menu;


public interface MenuDao extends BaseDao<Menu> {

	List<Map<String, Object>> findTreeData();

	int hasChild(Integer menuId);

}
