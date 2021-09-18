package com.se.springbootapi.controller;

import com.se.springbootapi.dto.UserDTO;
import com.se.springbootapi.entity.User;
import com.se.springbootapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<UserDTO> getUserList(){
        List<User> users = userService.getListUser();

        List<UserDTO> dtoList = new ArrayList<>();
        for (User user : users){
            dtoList.add(new UserDTO(user));
        }
        return dtoList;
    }
    @PostMapping("/users")
    public User saveUser(@RequestBody User user){

        return userService.saveUser(user);
    }
}
