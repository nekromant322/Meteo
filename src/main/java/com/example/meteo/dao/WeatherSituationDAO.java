package com.example.meteo.dao;

import com.example.meteo.model.WeatherSituation;
import org.springframework.data.repository.CrudRepository;

public interface WeatherSituationDAO extends CrudRepository<WeatherSituation,Long> {


}
