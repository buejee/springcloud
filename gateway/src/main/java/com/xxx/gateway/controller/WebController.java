package com.xxx.gateway.controller;
import com.xxx.gateway.domain.User;
import com.xxx.gateway.service.FeignService;
import com.xxx.gateway.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class WebController {
    @Autowired
    private RibbonService ribbonService;
    @Autowired
    private FeignService feignService;

    @RequestMapping(value = "/dispatch")
    @ResponseBody
    public List<User> sendMessage(@RequestBody String name){
        return feignService.save(name);
    }

    @RequestMapping(value = "/get",produces = {MediaType.TEXT_PLAIN_VALUE})
    public String get(){
        return ribbonService.get();
    }
}
