package com.au.common.mapper;

import java.util.List;
import java.util.Map;

import com.au.common.domain.RoleEx;
import com.au.common.domain.User;

public interface UserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    
    User login(Map<String, Object> map);

	User findUserByEmail(String email);

	List<RoleEx> selectRoleByUserId(Long id);
}