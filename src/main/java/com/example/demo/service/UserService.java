package com.example.demo.service;

import com.example.demo.pojo.User;

import java.util.List;

public interface UserService {

    List<User> getUserList();

    int insert(User user);

    int modUser(User user);
}
