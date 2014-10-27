package com.softserveinc.softtour.controller;

import com.softserveinc.softtour.entity.*;
import com.softserveinc.softtour.parsers.ItTourParser;
import com.softserveinc.softtour.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.sql.Time;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Controller
@RequestMapping(value = "/search")
public class SearchController {

    @RequestMapping(value = "/getTour", method = RequestMethod.POST)
    public @ResponseBody List<Tour> searchTour(
            @RequestParam(value = "country", required = true) String country,
            @RequestParam(value = "region", required = true) String region,
            @RequestParam(value = "twoStar", required = false) Integer twoStar,
            @RequestParam(value = "threeStar", required = false) Integer threeStar,
            @RequestParam(value = "fourStar", required = false) Integer fourStar,
            @RequestParam(value = "fiveStar", required = false) Integer fiveStar,
            @RequestParam(value = "foodOne", required = false) String foodOne,
            @RequestParam(value = "foodTwo", required = false) String foodTwo,
            @RequestParam(value = "foodThree", required = false) String foodThree,
            @RequestParam(value = "foodFour", required = false) String foodFour,
            @RequestParam(value = "foodFive", required = false) String foodFive,
            @RequestParam(value = "foodSix", required = false) String foodSix,
            @RequestParam(value = "adults", required = true) Integer adults,
            @RequestParam(value = "children", required = true) Integer children,
            @RequestParam(value = "dateFrom", required = true) String dateFrom,
            @RequestParam(value = "dateTo", required = true) String dateTo,
            @RequestParam(value = "nightFrom", required = true) Integer nightFrom,
            @RequestParam(value = "nightTo", required = true) Integer nightTo,
            @RequestParam(value = "priceFrom", required = true) Integer priceFrom,
            @RequestParam(value = "priceTo", required = true) Integer priceTo
    ){
        Set<Integer> hotelStars = new HashSet<>();
        if (twoStar != null){
            hotelStars.add(twoStar);
        }
        if (threeStar != null){
            hotelStars.add(threeStar);
        }
        if (fourStar != null){
            hotelStars.add(fourStar);
        }
        if (fiveStar != null){
            hotelStars.add(fiveStar);
        }

        Set<String> foodSet = new HashSet<>();
        if (foodOne != null){
            foodSet.add(foodOne);
        }
        if (foodTwo != null){
            foodSet.add(foodTwo);
        }
        if (foodThree != null){
            foodSet.add(foodThree);
        }
        if (foodFour != null){
            foodSet.add(foodFour);
        }
        if (foodFive != null){
            foodSet.add(foodFive);
        }
        if (foodSix != null){
            foodSet.add(foodSix);
        }

        ItTourParser parser = new ItTourParser(country, region, hotelStars, foodSet, adults, children, dateFrom, dateTo,
                nightFrom, nightTo, priceFrom, priceTo, 2);
        List<Tour> tourList = parser.parse();
        return tourList;
    }
}
