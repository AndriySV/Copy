package com.softserveinc.softtour.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.softserveinc.softtour.service.LogService;
import com.softserveinc.softtour.service.RoleService;
import com.softserveinc.softtour.service.UserService;

@Component
public class TestScheduled {

			@Autowired
			private LogService logService;  
	  
			
			@Scheduled(cron="*/10 * * * * *")
	  public void pollDatabase() {
		  
				logService.deleteLogs();
	  }

}
