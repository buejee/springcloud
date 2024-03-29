package com.xxx.ribbon;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class RibbonApplication {

    @Value("${springcloud.message}")
    private String message;

    @RequestMapping("/get")
    public String get(){
        return message;
    }

    public static void main(String[] args) {
        SpringApplication.run(RibbonApplication.class,args);
    }
}
