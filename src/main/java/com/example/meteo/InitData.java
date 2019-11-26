package com.example.meteo;

import com.example.meteo.model.Authority;
import com.example.meteo.model.User;
import com.example.meteo.model.WeatherSituation;
import com.example.meteo.model.weather.Weather;
import com.example.meteo.model.weather.WeatherResponse;
import com.example.meteo.service.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class InitData {

    @Autowired
    UserService userService;

    @Autowired
    AuthorityService authorityService;

    @Autowired
    SMSCService smscSender;

    @Autowired
    WeatherResponseService weatherResponseService;

    @Autowired
    WeatherSituationService weatherSituationService;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    public void initData() {

//        smscSender.send_sms("89775548911","TEST MESSAGE",1, "", "", 0, "", "");
        initUserAndRoles();
        initWeatherSituation();

    }

    private void initWeatherSituation() {
        try {

            for (int i = 0; i < 10; i++) {
                WeatherResponse weatherResponse = weatherResponseService.get(i, i);
                WeatherSituation weatherSituation = new WeatherSituation(weatherResponse);
                weatherSituationService.insert(weatherSituation);

            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    private void initUserAndRoles() {
        Authority adminAuthority = new Authority("ROLE_ADMIN");
        Authority userAuthority = new Authority("ROLE_USER");
        authorityService.insert(adminAuthority);
        authorityService.insert(userAuthority);

        List<Authority> authorities = new ArrayList<>();
        authorities.add(adminAuthority);
        userService.insert(new User("1@mail.ru", bCryptPasswordEncoder.encode("1"), authorities));


    }

}
