package com.lms.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lms.entities.AdminInfo;
import com.lms.repository.AdminInfoRepository;
import com.lms.service.AdminService;

@Service
public class AdminInfoServiceImpl implements  AdminService{
	@Autowired
	AdminInfoRepository admininfoRepository;
	@Override
	public AdminInfo createAdminInfo(AdminInfo  admin)
	{
		// TODO Auto-generated method stub
		return admininfoRepository.save(admin);
	}
	
	@Override
	public AdminInfo getAdminInfoById(int Aid){
		// TODO Auto-generated method stub
		return admininfoRepository.findById(Aid).get();
	}
	

	
	

}
