package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestingController {

    @GetMapping("/hi")
    public String sayHi() {
        return "Hii This is first Spring boot Project!!!! Starting SpringBoot";
    }
    @GetMapping("/hello")
    public String sayHello() {
        return "Welcome to Spring Boot";
    }
    @GetMapping("/bye")
    public String sayBye()
    {
    	return "Spring Boot is Good";
    }
    @GetMapping("/bye1")
    public String sayBye1()
    {
    	return "Spring Boot is Good and Robust";
    }
    
}