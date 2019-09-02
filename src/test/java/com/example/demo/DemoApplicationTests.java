package com.example.demo;

import com.example.demo.pojo.User;
import com.example.demo.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringRunner;
import tk.mybatis.spring.annotation.MapperScan;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@MapperScan("com.example.demo.dao")
@ComponentScan(basePackages= {"com.example.demo"})
public class DemoApplicationTests {

    @Autowired
    private UserService userService;

    @Test
    public void contextLoads() {
        List<User> users = userService.getUserList();
        System.out.println(users.size());
    }

    @Test
    public void inset() {
        User user = new User();
        user.setId(101);
        user.setName("kris wu");
        int result = userService.insert(user);
        System.out.println(result);
    }

}
