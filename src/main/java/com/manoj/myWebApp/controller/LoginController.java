package com.manoj.myWebApp.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
public class LoginController {

    @RequestMapping("/login")
    public String login() {
        return "Welcome to Login Page!";
    }

    
}