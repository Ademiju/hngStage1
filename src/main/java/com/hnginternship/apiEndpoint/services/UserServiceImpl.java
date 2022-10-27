package com.hnginternship.apiEndpoint.services;

import com.hnginternship.apiEndpoint.datas.User;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public User getUserDetails() {
        User user = new User("Ademiju1",true,27,
                "I'm a Java Backend Engineer, looking to collaborate and hone my skills from beginner to mid-level");
        return user;
    }
}
