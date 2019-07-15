package com.xxx.feign.service;

import com.xxx.feign.dao.UserDao;
import com.xxx.feign.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public List<User> save(String name){
        User user = new User(name);
        userDao.save(user);
        List<User> list = userDao.findAll(PageRequest.of(0,10)).getContent();
        return list;
    }
}
