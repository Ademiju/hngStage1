package com.hnginternship.apiEndpoint.controller;

import com.hnginternship.apiEndpoint.datas.User;
import com.hnginternship.apiEndpoint.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/details")
    public User getUserDetails(){
        return userService.getUserDetails();

    }


}
