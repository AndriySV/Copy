package com.softserveinc.softtour.controller;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.softserveinc.softtour.entity.User;
import com.softserveinc.softtour.entity.template.Sex;
import com.softserveinc.softtour.service.RoleService;
import com.softserveinc.softtour.service.TourService;
import com.softserveinc.softtour.service.UserService;

@Controller
@RequestMapping(value="/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@Autowired
	private RoleService roleService;
	
	@RequestMapping(value="/save")
	public String saveUser() {
		User user = new User("Pink", "try@com", "1234", Date.valueOf("1979-09-08"), (byte)35, Sex.FEMALE, "775511", roleService.findById(1));
		return "";
	}
	
}
