package com.authentication.jwtAuth.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.authentication.jwtAuth.models.User;
import com.authentication.jwtAuth.services.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;




@RestController
@RequestMapping("/home")
public class Homecontroller {

    @Autowired
    private UserService userService;

    @GetMapping("/getUser")
    public List<User> getUser(){
      return userService.getAllUser();
    }

    @PostMapping("/createUser")
    public User createUser(@RequestBody User user) {
        
        return userService.createUser(user);
    }
    
    
}
