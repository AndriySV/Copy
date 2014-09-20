package com.softserveinc.softtour.controller;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.softserveinc.softtour.entity.Favorite;
import com.softserveinc.softtour.entity.Tour;
import com.softserveinc.softtour.entity.User;
import com.softserveinc.softtour.service.FavoriteService;

@Controller
@RequestMapping(value="/favorite")
public class FavoriteController {

	@Autowired
	private FavoriteService favoriteService;
	
	@RequestMapping(value="/test")
	public String testSave() {

		User user = new User();
		user.setId(1);
		
		Tour tour = new Tour();
		tour.setId(2);
		
		Favorite favorite = new Favorite(Date.valueOf("2014-08-01"), user, tour);
		
		//favoriteService.save(favorite);
		
		//favoriteService.update(9, favorite);
		
		//favoriteService.delete(10);
		
		System.out.println(favoriteService.findById(11));
		System.out.println("---------------------");
		
		List<Favorite> list = favoriteService.findAll();
		show(list);
		
		return "index";
	}
	
	
	private void show(List<Favorite> list) {
		for (Favorite favorite : list) {
			System.out.println(favorite);
		}
	}
	
	@RequestMapping(value="/find", method=RequestMethod.GET)
	public String find(Favorite favorite) {
		
		List<Favorite> list = favoriteService.findByAnyParameters(favorite.getId(), favorite.getDate(), favorite.getUser(), favorite.getTour());
		show(list);
		
		return "index";
	}
	
}
