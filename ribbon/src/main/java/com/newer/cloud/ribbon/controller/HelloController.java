package com.newer.cloud.ribbon.controller;

import com.newer.cloud.ribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloController {
    @Autowired
    private HelloService helloService;
    @GetMapping("/hello")
    public String sayHello(String name){
        Thread
     return helloService.sayHello()+" "+name;
    }


}
