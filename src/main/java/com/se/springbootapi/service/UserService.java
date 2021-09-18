package com.se.springbootapi.service;

import com.se.springbootapi.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    public List<User> getListUser();

    public User saveUser(User user);
}
