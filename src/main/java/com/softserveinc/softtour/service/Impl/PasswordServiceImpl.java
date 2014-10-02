package com.softserveinc.softtour.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softserveinc.softtour.entity.Password;
import com.softserveinc.softtour.repository.PasswordRepository;
import com.softserveinc.softtour.service.PasswordService;

@Service
public class PasswordServiceImpl implements PasswordService {

	@Autowired
	private PasswordRepository passwordRepository; 
	
	@Override
	public void save(Password password) {
		passwordRepository.save(password);
	}
	
	
}
