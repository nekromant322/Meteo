package com.example.meteo.dao;

import com.example.meteo.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserDAO extends CrudRepository<User,Long> {

    User findByEmail(String email);
    User findById(long id);


}
