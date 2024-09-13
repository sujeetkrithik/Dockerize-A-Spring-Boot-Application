package com.Docker.Docker_App.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping()
    public String getMessage(){
        return "Welcome to Gemini";
    }
}
