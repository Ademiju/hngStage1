package com.hnginternship.apiEndpoint.services;

import com.hnginternship.apiEndpoint.datas.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserServiceImplTest {

    @Autowired
    UserService userService;
    @Test
    void userDetailsCanBeDisplayedTest() {
        User user = new User("Ademiju1",true,27,
                "Ademiju Taiwo is a Java Backend Engineer. Looking to collaborate and hone my skills from beginner to mid-level");
        assertEquals(user.getSlackUsername(),(userService.getUserDetails().getSlackUsername()));
        assertEquals(user.getBackend(),(userService.getUserDetails().getBackend()));
        assertEquals(user.getAge(),(userService.getUserDetails().getAge()));
        assertEquals(user.getBio(), userService.getUserDetails().getBio());

    }
}