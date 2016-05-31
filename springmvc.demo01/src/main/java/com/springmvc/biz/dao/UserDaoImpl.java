package com.springmvc.biz.dao;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import org.springframework.stereotype.Repository;

import com.springmvc.biz.dto.UserDto;

@Repository("userDao")
public class UserDaoImpl extends SqlMapClientDaoSupport{
	
	@SuppressWarnings("unchecked")
	public List<String> loginByName(String name){
		List<String> list = getSqlMapClientTemplate().queryForList("loginByName", name);
		return list;
	}
	
	@SuppressWarnings("unchecked")
	public List<String> loginByNamePass(UserDto userDto){
		List<String> list = getSqlMapClientTemplate().queryForList("loginByNamePass",userDto);
		return list;
	}
}
