package com.newer.cloud.ribbon.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
    public  String sayHello(){
        return "Newer Spring Cloud";
    }
}
