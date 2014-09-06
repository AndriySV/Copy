package com.softserveinc.softtour;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.softserveinc.softtour.dao.UserDao;

public class Main {

	private ApplicationContext context;
	
	public static void main(String[] args) {
		Main ob = new Main();
		ob.createContext();
	}

	private void createContext() {
		context = new ClassPathXmlApplicationContext("spring/config.xml");
		
		// h
		UserDao userDao = (UserDao) context.getBean("userDao");
		
	}
	
}
