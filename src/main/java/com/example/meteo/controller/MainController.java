package com.example.meteo.controller;

import com.example.meteo.model.User;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

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

    @GetMapping("lc")
    public ModelAndView lc(Authentication auth) {
        ModelAndView model = new ModelAndView("lc");
        User user = (User) auth.getPrincipal();
        model.addObject("email", user.getEmail());


        return model;
    }
}
