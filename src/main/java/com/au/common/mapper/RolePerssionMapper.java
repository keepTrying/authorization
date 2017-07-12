package com.au.common.mapper;

import java.util.List;
import java.util.Map;

import com.au.common.domain.RolePermission;

public interface RolePerssionMapper {
    int insert(RolePermission record);

    int insertSelective(RolePermission record);
    
    List<RolePermission> findRolePermissionByPid(Long id);
	
	List<RolePermission> findRolePermissionByRid(Long id);
	
	List<RolePermission> find(RolePermission entity);
	
	int deleteByPid(Long id);
	int deleteByRid(Long id);
	int delete(RolePermission entity);

	int deleteByRids(Map<String,Object> resultMap);
}