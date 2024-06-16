package com.lms.utility;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.lms.entities.UserInfo;
import com.lms.model.UserInfoDTO;

@Component
public class UserInfoConverter {
	//convert DTO to Entity
	public UserInfo convertToUserInfoEntity(UserInfoDTO userinfoDTO)
	{
		UserInfo user=new UserInfo();
		if(userinfoDTO!=null)
		{
			BeanUtils.copyProperties(userinfoDTO, user);
		}
		return user;
	}
	
	//Convert Entity to DTO
	public UserInfoDTO convertToUserInfoDTO(UserInfo user)
	{
		UserInfoDTO userinfoDTO=new UserInfoDTO();
		if(user!=null)
		{
			BeanUtils.copyProperties(user, userinfoDTO);
		}
		return userinfoDTO;
	}
}
