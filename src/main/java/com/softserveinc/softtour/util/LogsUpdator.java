package com.softserveinc.softtour.util;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.softserveinc.softtour.entity.Role;
import com.softserveinc.softtour.entity.User;
import com.softserveinc.softtour.entity.template.Sex;
import com.softserveinc.softtour.service.LogService;
import com.softserveinc.softtour.service.RoleService;
import com.softserveinc.softtour.service.UserService;

@EnableScheduling
public class LogsUpdator {

	@Autowired
	private LogService logService; 
	
	@Autowired
	private UserService  userService;
	
	@Autowired
	private RoleService roleService;
	
	public void run() {
		
		logService.deleteLogs();

		
		
	/*	User user = new User();
		user.setName("Test1");
		user.setEmail("test1@gm");
		user.setPassword("testtest");
		user.setBirthday( Date.valueOf("2013-11-12"));
		user.setSex(Sex.MALE);
		user.setPhone("911");
		user.setRole(roleService.findByName("ROLE_USER"));
		userService.save(user);*/
		
	}
	
}
