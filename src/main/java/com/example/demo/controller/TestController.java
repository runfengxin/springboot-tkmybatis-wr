package com.example.demo.controller;

import com.example.demo.pojo.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    @Autowired
    private UserService userService;

    @GetMapping("insert")
    public String insert(){
        User user = new User();
        user.setId(102);
        user.setName("kris xin");
        int result = userService.insert(user);
        return String.valueOf(result);
    }

    @GetMapping("list")
    public String list(){
        List<User> result = userService.getUserList();
        return result.toString();
    }

    @GetMapping("update")
    public String update(){
        User user = new User();
        user.setId(102);
        user.setName("xinxi");
        int result = userService.modUser(user);
        return String.valueOf(result);
    }
}
