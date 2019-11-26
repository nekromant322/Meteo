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


    @Value("${open.weather.api.key}")
    String WEATHER_API_KEY;

    @Value("${open.weather.api.url}")
    String WEATHER_API_URL;

    public WeatherResponse get(double lat, double lon) {

        if (Math.abs(lat) > 180 || Math.abs(lon) > 180) {
            throw new IllegalArgumentException("Coordinates should be between -180 and 180 degree");
        }
        RestTemplate restTemplate = new RestTemplate();
        String weatherResourceUrl
                = WEATHER_API_URL + "?lat=" + lat + "&lon=" + lon +"&APPID=" + WEATHER_API_KEY;
        //dont know what is for : &id=524901&
        WeatherResponse weatherResponse
                = restTemplate.getForObject(weatherResourceUrl, WeatherResponse.class);

        return weatherResponse;
    }

}
