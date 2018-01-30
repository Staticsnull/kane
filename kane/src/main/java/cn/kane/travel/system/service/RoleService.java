package cn.kane.travel.system.service;

import java.util.List;
import java.util.Map;

import cn.kane.travel.common.web.PageObject;
import cn.kane.travel.system.entity.Role;

public interface RoleService {

	Map<String, Object> findObjects(Role role, PageObject pageObj);

	List<Map<String, Object>> loadMenuTree();

	void save(Role role,String menuIdList);

	Map<String, Object> findRoleById(Integer roleId);

	void updateRole(Role role,String menuIdList);

	void deleteRole(Integer roleId);

}
