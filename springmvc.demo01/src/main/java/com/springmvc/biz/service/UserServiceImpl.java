package com.springmvc.biz.service;

import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

import com.springmvc.biz.dao.UserDaoImpl;
import com.springmvc.biz.dto.UserDto;

@Service("userService")
public class UserServiceImpl{
	
	@Resource
	private UserDaoImpl userDao;
	
	public HashMap<String,Object> login(UserDto userDto){
		HashMap<String,Object> map = new HashMap<String,Object>();
		List<String> listN = userDao.loginByName(userDto.getName());
		if(StringUtils.isEmpty(listN.get(0))){
			map.put("msg", "用户名不存在！");
		}else{
			List<String> listNP = userDao.loginByNamePass(userDto);
			if(StringUtils.isEmpty(listNP.get(0))){
				map.put("msg", "请输入正确的密码！");
			}else{
				map.put("msg", "登陆成功！");
			}
		}
		return map;
	}

}
