package com.example.test.model.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.example.test.model.bean.UserInfo;

@Mapper
public interface UserMapper {
	public void addUser(UserInfo user);
}
