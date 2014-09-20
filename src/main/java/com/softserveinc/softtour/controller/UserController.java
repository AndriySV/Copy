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
	public String saveUser(@RequestParam String name, 
			@RequestParam String email,
			@RequestParam String password,
			@RequestParam String birthday,
			@RequestParam String sex,
			@RequestParam String phone ) {
		
		// Need to count age
		byte age = 0;
		
		// Need to define role
		Role role = null;
		//userService.save(name, email, password, Date.valueOf(birthday), age, Sex.FEMALE, phone, role);
		
		return "/";
	}
	
	
	@RequestMapping(value="/all")
	public @ResponseBody List<User> showAll() {
		
		Role role = new Role();
		role.setId(1);
		role.setName("admin");
		User user = new User("Ronaldinyo", "ronald@gmail", "football2", Date.valueOf("1972-12-03"), (byte)43, Sex.MALE, "0957744565", role);
		
		//userService.save(user);
		
		//userService.update(19, "Ronaldo", "teeth", "1111", Date.valueOf("1962-12-03"), (byte)49, Sex.MALE, "doesn't", role);
		
		//userService.delete(16);
		
		//user = userService.findById(18);
		//System.out.println(user);
		//System.out.println("---------------------------------");
		
		//List<User> list = userService.findBy("Pepe", null, "1111");
		
		
		
		
		List<User> list = userService.findAll();
		show(list);

		return userService.findAll();
	}

	@RequestMapping(value="/find", method=RequestMethod.GET)
	public @ResponseBody  List<User> find(User user) {
		
	List<User> list = userService.findByAnyParameters(user.getId(), user.getName(), 
			user.getEmail(), user.getPassword(), user.getBirthday(), user.getAge(), 
			user.getSex(), user.getPhone(), user.getRole());
		
	show(list);
		
		return userService.findAll();
	}
	
	
	private void show(List<User> list) {

		for (User user : list) {
			System.out.println(user);
		}
	}
	
}
