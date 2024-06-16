package com.lms.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lms.entities.UserInfo;
import com.lms.repository.UserInfoRepository;
import com.lms.service.UserService;
@Service
public class UserInfoServiceImpl implements UserService{
	
	@Autowired
	UserInfoRepository userinfoRepository;
	@Override
	public UserInfo createUserInfo(UserInfo  user)
	{
		// TODO Auto-generated method stub
		return userinfoRepository.save(user);
	}
    
	@Override
	public List<UserInfo> getAllUserInfo() {
		// TODO Auto-generated method stub
		return userinfoRepository.findAll();
	}
	@Override
	public UserInfo getUserInfoById(int Uid) {
		// TODO Auto-generated method stub
		return userinfoRepository.findById(Uid).get();
	}
	@Override
	public String deleteUserInfoById(int Uid) {
		// TODO Auto-generated method stub
		userinfoRepository.deleteById(Uid);
		return "User is deleted";
	}

	@Override
	public String updateUserInfoById(int Uid) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
