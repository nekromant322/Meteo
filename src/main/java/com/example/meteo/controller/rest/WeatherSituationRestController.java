package com.example.meteo.controller.rest;

import com.example.meteo.model.WeatherSituation;
import com.example.meteo.model.weather.WeatherResponse;
import com.example.meteo.service.WeatherResponseService;
import com.example.meteo.service.WeatherSituationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/weather")
public class WeatherSituationRestController {

    @Autowired
    WeatherResponseService weatherResponseService;

    @GetMapping
    public WeatherSituation getSituation(@RequestParam double lat, @RequestParam double lon) {
        WeatherSituation weatherSituation = weatherResponseService.getWeatherSituation(lat, lon);
        return weatherSituation;
    }
}
