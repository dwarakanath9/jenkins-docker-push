package com.org.info.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping
    public String sayHello(){
        return "Hellow i am from docker";
    }

    @GetMapping("/hello")
    public String sayHelloDocker(){
        return "Hellow i am from docker hellow 1";
    }
}
