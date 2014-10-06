package com.softserveinc.softtour.controller;

import com.softserveinc.softtour.entity.Country;
import com.softserveinc.softtour.entity.Favorite;
import com.softserveinc.softtour.entity.HistoryRecord;
import com.softserveinc.softtour.entity.User;
import com.softserveinc.softtour.service.CountryService;
import com.softserveinc.softtour.service.FavoriteService;
import com.softserveinc.softtour.service.HistoryRecordService;
import com.softserveinc.softtour.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(value = "/userProfile")
public class UserProfileConroller {

    @Autowired
    private UserService userService;

    @Autowired
    private FavoriteService favoriteService;

    @Autowired
    private HistoryRecordService historyRecordService;

    @Autowired
    private CountryService countryService;



    @RequestMapping(value = "/currentUser", method = RequestMethod.GET)
    public @ResponseBody User getCurrentUser() {
        return userService.findById(1);
    }

    @RequestMapping(value = "/userFavorite", method = RequestMethod.GET)
    public @ResponseBody List<Favorite> findUserFavorite() {
        List<Favorite> currentUserFavorites = favoriteService.findByUser(userService.findById(1));
        return currentUserFavorites;
    }

    @RequestMapping(value = "/userHistory", method = RequestMethod.GET)
    public @ResponseBody List<HistoryRecord> findUserHistory() {
        List<HistoryRecord> currentUserRecords = historyRecordService.findByUser(userService.findById(1));
        return currentUserRecords;
    }

    @RequestMapping(value="userToUpdate", method = RequestMethod.POST)
    public @ResponseBody User updateUserProfile( @RequestBody final User userToUpdate) {
        User updatedUser;

        updatedUser = userService.findByEmail(userToUpdate.getEmail());
        updatedUser.setName(userToUpdate.getName());
        updatedUser.setPassword(userToUpdate.getPassword());
        updatedUser.setBirthday(userToUpdate.getBirthday());
        updatedUser.setSex(userToUpdate.getSex());
        updatedUser.setPhone(userToUpdate.getPhone());

        userService.save(updatedUser);

        return userToUpdate;
    }





}