package com.softserveinc.softtour.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softserveinc.softtour.entity.Logs;
import com.softserveinc.softtour.repository.LogRepository;
import com.softserveinc.softtour.service.LogService;

@Service
public class LogServiceImpl implements LogService {

	@Autowired
	private LogRepository logRepository; 
	
	@Override
	public void deleteLogs() {
	
		System.out.println(logRepository);
		
		logRepository.deleteWeekLogs(207);
		
		
	}

}
