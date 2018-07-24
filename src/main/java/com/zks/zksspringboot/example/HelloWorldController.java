package com.zks.zksspringboot.example;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {

    @RequestMapping("/{id}")
    public User getUser(@PathVariable("id") int id){
        User user=new User();
        user.setId(id);
        user.setName("zhangsan");
        return user;
    }
}
