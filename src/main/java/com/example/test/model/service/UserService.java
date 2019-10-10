package com.example.test.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.test.model.bean.UserInfo;
import com.example.test.model.mapper.UserMapper;

@Service
public class UserService {
	@Autowired
	private UserMapper userMapper;
	
	@Transactional
	public void  addUser(UserInfo user){
		userMapper.addUser(user);
	}
	
	
}
