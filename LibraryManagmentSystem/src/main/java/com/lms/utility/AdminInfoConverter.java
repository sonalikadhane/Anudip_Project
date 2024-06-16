package com.lms.utility;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.lms.entities.AdminInfo;
import com.lms.model.AdminInfoDTO;
@Component
public class AdminInfoConverter {

		//convert DTO to Entity
		public AdminInfo convertToAdminInfoEntity(AdminInfoDTO admininfoDTO)
		{
			AdminInfo admin=new AdminInfo();
			if(admininfoDTO!=null)
			{
				BeanUtils.copyProperties(admininfoDTO, admin);
			}
			return admin;
		}
		
		//Convert Entity to DTO
		public AdminInfoDTO convertToAdminInfoDTO(AdminInfo admin)
		{
			AdminInfoDTO admininfoDTO=new AdminInfoDTO();
			if(admin!=null)
			{
				BeanUtils.copyProperties(admin, admininfoDTO);
			}
			return admininfoDTO;
		}

}
