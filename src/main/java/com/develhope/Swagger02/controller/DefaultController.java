package com.develhope.Swagger02.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultController {

    @GetMapping("/")
    public String welcomeMessage(){
        return "Welcome!";
    }
}
