package cn.kane.travel.system.dao;
import java.util.List;
import java.util.Map;

import cn.kane.travel.common.dao.BaseDao;
import cn.kane.travel.system.entity.Role;

public interface RoleDao extends BaseDao<Role> {

	List<Map<String, Object>> findRoleList();

	

}
