package com.springmvc.web.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.springmvc.biz.dto.UserDto;
import com.springmvc.biz.service.UserServiceImpl;


@Controller
@RequestMapping(value="/user")
public class UserController {
	
	@Autowired
	private UserServiceImpl userService;
	
	/**
	 * 进入登陆界面
	 * @return
	 */
	@RequestMapping(value="/goLogin")
	public String goIndex(){
		return "login";
	}
	
	/**
	 * 提交登陆信息
	 * @param userDto
	 * @return
	 */
	@RequestMapping("/doLogin")
	public ModelAndView doLogin(UserDto userDto){
		HashMap<String, Object> hashMap = new HashMap<String, Object>();
		hashMap = userService.login(userDto);
		
		hashMap.put("userDto", userDto);
		return new ModelAndView("login",hashMap);
	}

}
