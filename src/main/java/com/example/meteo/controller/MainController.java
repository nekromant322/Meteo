package com.example.meteo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("loginPage")
    public String showLoginPage(){
        return "login";
    }

    @GetMapping("registration")
    public String showRegistrationPage(){
        return "registration";
    }

    @GetMapping("weather")
    public String getDefaultWeather(){
        return "defaultWeather";
    }

    @GetMapping("/newMap")
    public String newMap() {
        return "newMap";
    }
}
