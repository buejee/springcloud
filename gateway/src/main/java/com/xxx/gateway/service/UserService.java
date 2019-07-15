package com.xxx.gateway.service;

import com.xxx.gateway.domain.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
@FeignClient("feign")
public interface UserService {

    @RequestMapping(method= RequestMethod.POST, value = "/save",
       produces = MediaType.APPLICATION_JSON_VALUE,
       consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public List<User> save(@RequestBody String name);
}
