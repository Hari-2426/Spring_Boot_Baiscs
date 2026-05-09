package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.StudentData;
import com.example.demo.services.StudentService;

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
    
    @Autowired
    StudentService ss;
    
    @GetMapping("/insert")
    public String insertStu()
    {
    	ss.insertStudent();
    	return "Student Data Inserted Into DataBase Successfully!!!!";
    }
    
    @GetMapping("/get")
    public List<StudentData> retriveData()
    {
        return ss.getStudentData();
    }
}