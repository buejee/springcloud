package com.xxx.gateway.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.xxx.gateway.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FeignService {
    @Autowired
    private UserService userService;

    @HystrixCommand(fallbackMethod = "fallbackSave")
    public List<User> save(String name){
        return userService.save(name);
    }

    public List<User> fallbackSave(String name){
        List<User> list = new ArrayList<>();
        User user = new User("user service broker.");
        list.add(user);
        return list;
    }
}
