package com.authentication.jwtAuth.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.authentication.jwtAuth.models.User;
import com.authentication.jwtAuth.repository.UserRepository;

@Service
public class UserService {


     @Autowired
    private UserRepository userRepository;


    public List<User> getAllUser(){
      return userRepository.findAll();
    }  
    
    public User createUser(User user){
       return userRepository.save(user);
    }
    
}
