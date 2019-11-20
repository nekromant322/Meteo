package com.example.meteo.surmises;

import com.example.meteo.surmises.gismeteoModel.GismeteoAnswer;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class GismeteoService {

    public GismeteoAnswer getTestData() {
        RestTemplate restTemplate = new RestTemplate();
        String url = "";
        return new GismeteoAnswer();
    }

}
