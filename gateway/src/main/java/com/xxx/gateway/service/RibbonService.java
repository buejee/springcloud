package com.xxx.gateway.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RibbonService {
    @Autowired
    private RestTemplate restTemplate;
    @HystrixCommand(fallbackMethod = "fallbackGet")
    public String get(){
        return  restTemplate.getForObject("http://ribbon/get",String.class);
    }


    public String fallbackGet(){
        return "ribbon service broker.";
    }
}
