package com.softserveinc.softtour.parsers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test {

	public static void main(String[] args) throws ParseException {

		String depatureTrain = "01/01/2014 23:00";
		String OnWay = "02:34";
		
		String depatureFly = "02/01/2014 04:00";

		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		
		String hours = OnWay.substring(0, 2);
		String minutes = OnWay.substring(3, 5);
		
		 Calendar cal = Calendar.getInstance(); 
		 cal.setTime(dateFormat.parse(depatureTrain)); 

		 cal.add(Calendar.HOUR_OF_DAY, Integer.parseInt(hours));
		 cal.add(Calendar.MINUTE, Integer.parseInt(minutes));
		
		Date depatureFlyDate = dateFormat.parse(depatureFly);
		
		long ressult = depatureFlyDate.getTime() - cal.getTime().getTime();
		
		System.out.println(ressult / 3600000);
					

	}
	
	
	

}
