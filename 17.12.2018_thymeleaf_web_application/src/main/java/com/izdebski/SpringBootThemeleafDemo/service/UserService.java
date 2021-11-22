package com.izdebski.SpringBootThemeleafDemo.service;

import java.util.ArrayList;
import java.util.List;

import com.izdebski.SpringBootThemeleafDemo.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private List<User> userList = new ArrayList<>();
    public List<User> getAllUsers(){
        return userList;
    }
    public void addUser(User user) {
        userList.add(user);
    }
}