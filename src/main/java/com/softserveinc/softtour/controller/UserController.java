package com.softserveinc.softtour.controller;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.softserveinc.softtour.entity.Role;
import com.softserveinc.softtour.entity.User;
import com.softserveinc.softtour.entity.template.Sex;
import com.softserveinc.softtour.service.UserService;

@Controller
@RequestMapping(value="/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/save", method=RequestMethod.GET)
	public String saveUser(User user ) {
		
		// Need to check  the type which is returned by jsp !!! 
		//user.setBirthday(birthday);
		
		// Need to count age
		byte age = 0;
		user.setAge(age);
		
		//Need to set sex
		Sex sex = null;
		user.setSex(sex);
		
		// Need to define role
		Role role = null;
		
		userService.save(user);
		
		
		/*(user.getName(), user.getEmail(), user.getPassword(), 
				Date.valueOf(birthday), age, Sex.FEMALE, phone, role);
		*/
		
		
		return "/";
	}
	
	
}
