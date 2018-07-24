package com.zks.zksspringboot.example.user.controller;

import com.zks.zksspringboot.example.user.mapper.UserMapper;
import com.zks.zksspringboot.example.user.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping(value = "/getUserList",method = RequestMethod.GET)
    public List<User> getUserList(){

        return userMapper.getUserList();
    }
}
