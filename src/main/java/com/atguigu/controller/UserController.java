package com.atguigu.controller;

import com.atguigu.pojo.User;
import com.atguigu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Administrator
 * @create 2020-09-02 20:49
 */
@RestController
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/user/findAll")
    public List<User> findAll(){
        return userService.findAll();
    }
}
