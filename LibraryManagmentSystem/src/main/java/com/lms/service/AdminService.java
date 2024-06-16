package com.lms.service;


import com.lms.entities.AdminInfo;



public interface AdminService {
	AdminInfo createAdminInfo(AdminInfo  admin);
	AdminInfo getAdminInfoById(int Aid);
	

}
