package com.example.demoenvironments2.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerWelcome {

    @Value("${welcomeMsg}")
    private String welcomeMsg;

    @GetMapping("/getWelcome")
    public String getWelcomeMessage() {
        return welcomeMsg;
    }

}
