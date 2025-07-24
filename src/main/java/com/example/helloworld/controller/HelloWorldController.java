package com.example.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/clover")
    public String sendGreetings() {
        return "Welcome Clover Infotech!";
    }
}
