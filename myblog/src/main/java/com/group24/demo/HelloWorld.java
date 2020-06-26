package com.group24.demo;

import com.group24.demo.entity.User;
import com.group24.demo.repository.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloWorld {
    private UserRepository userRepository;

    @RequestMapping("/hello")
    public String findAll(){
        return "hello"; }




}
