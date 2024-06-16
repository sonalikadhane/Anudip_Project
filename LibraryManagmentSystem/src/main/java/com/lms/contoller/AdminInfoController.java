package com.lms.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lms.entities.AdminInfo;
import com.lms.service.AdminService;

@RestController
@RequestMapping("/api")
public class AdminInfoController {
	@Autowired
	AdminService adminService;
	
	@PostMapping("/createAdmin")
	ResponseEntity<AdminInfo> createStudent(@RequestBody AdminInfo admin)
	{
		return new ResponseEntity<AdminInfo>(adminService.createAdminInfo(admin),HttpStatus.CREATED);
	}
	@GetMapping("/getAdmin{aid}")
	AdminInfo getAdminInfoById(@PathVariable("aid") int Aid)
	{
		return adminService.getAdminInfoById(Aid);
		
	}

}
