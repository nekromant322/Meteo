package com.example.meteo.service;

import com.example.meteo.model.weather.WeatherResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.transaction.Transactional;

@Service
public class WeatherResponseService {

    @Autowired
    private ObjectMapper jacksonObjectMapper;

    @Value("${open.weather.api.key}")
    String WEATHER_API_KEY;


    public void getTestWeather() {

        RestTemplate restTemplate = new RestTemplate();
        String fooResourceUrl
                = "http://api.openweathermap.org/data/2.5/weather?lat=59&lon=65&id=524901&APPID=" + WEATHER_API_KEY;
        ResponseEntity<String> response
                = restTemplate.getForEntity(fooResourceUrl, String.class);
        System.err.println(response.getBody());
    }

    public WeatherResponse getTestWeatherPOJO() {

        RestTemplate restTemplate = new RestTemplate();
        String fooResourceUrl
                = "http://api.openweathermap.org/data/2.5/weather?lat=59&lon=65&id=524901&APPID=" + WEATHER_API_KEY;
        WeatherResponse weatherResponse
                = restTemplate.getForObject(fooResourceUrl, WeatherResponse.class);

        return weatherResponse;
    }

}
