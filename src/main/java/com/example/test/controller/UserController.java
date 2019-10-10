package com.example.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.test.model.bean.UserInfo;
import com.example.test.model.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping("addUser")
	public String addUser(UserInfo user){
		userService.addUser(user);
		return "addUser.jsp";
	}
	
}
