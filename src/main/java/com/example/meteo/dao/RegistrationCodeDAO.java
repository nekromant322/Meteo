package com.example.meteo.dao;

import com.example.meteo.model.RegistrationCode;
import com.example.meteo.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RegistrationCodeDAO extends CrudRepository<RegistrationCode,Long> {

    RegistrationCode findByEmail(String email);
    List<RegistrationCode> findAll();


}
