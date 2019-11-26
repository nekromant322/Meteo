package com.example.meteo.service;

import com.example.meteo.model.Authority;
import com.example.meteo.dao.AuthorityDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorityService {

    @Autowired
    AuthorityDAO authorityDAO;

    public void insert(Authority authority) {
        authorityDAO.save(authority);
    }
}
