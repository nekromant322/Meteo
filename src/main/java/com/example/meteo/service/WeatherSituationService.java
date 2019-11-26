package com.example.meteo.service;

import com.example.meteo.dao.WeatherSituationDAO;
import com.example.meteo.model.WeatherSituation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WeatherSituationService {

    @Autowired
    WeatherSituationDAO weatherSituationDAO;

    public void insert(WeatherSituation weatherSituation) {
        weatherSituationDAO.save(weatherSituation);
    }


}
