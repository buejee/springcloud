package com.xxx.feign.web;

import com.xxx.feign.domain.User;
import com.xxx.feign.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    public UserService userService;
    @PostMapping("/save")
    public List<User> save(@RequestBody String name){
        return userService.save(name);
    }
}
