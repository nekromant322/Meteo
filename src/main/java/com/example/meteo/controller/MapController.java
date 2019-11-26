package com.example.meteo.controller;


import com.example.meteo.service.WeatherResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/map")
public class MapController {

    @Autowired
    WeatherResponseService weatherService;

    @GetMapping("/test")
    public String showDefaultMap(){
        return "defaultMap";
    }
}
