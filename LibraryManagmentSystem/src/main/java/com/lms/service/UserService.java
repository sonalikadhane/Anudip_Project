package com.lms.service;

import java.util.List;

import com.lms.entities.UserInfo;

public interface UserService {
	UserInfo createUserInfo(UserInfo user);
	List<UserInfo>getAllUserInfo();
	UserInfo getUserInfoById(int Uid);
	String deleteUserInfoById(int Uid);
	String updateUserInfoById(int Uid);

}
