package com.org.info.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
public class HelloController {

    @GetMapping
    public String sayHello() throws UnknownHostException{
        return " your name is :" + InetAddress.getLocalHost().getHostName();
    }

    @GetMapping("/hello")
    public String sayHelloDocker(){
        return "Hellow i am from docker hellow 1";
    }

    @GetMapping("/hello/{name}")
    public String sayHelloDocker(String name)  {
        return " your name is :" + name;
    }
}
