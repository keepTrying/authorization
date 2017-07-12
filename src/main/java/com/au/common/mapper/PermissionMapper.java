package com.au.common.mapper;

import java.util.List;
import java.util.Set;

import com.au.common.domain.Permission;
import com.au.common.domain.PermissionEx;

public interface PermissionMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Permission record);

    int insertSelective(Permission record);

    Permission selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Permission record);

    int updateByPrimaryKey(Permission record);
    
    List<PermissionEx> selectPermissionByRoleId(Long id);
	//根据用户ID获取权限的Set集合
	Set<String> findPermissionByUserId(Long id);
}