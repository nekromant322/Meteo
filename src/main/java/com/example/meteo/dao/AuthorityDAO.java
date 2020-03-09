package com.example.meteo.dao;

import com.example.meteo.model.Authority;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AuthorityDAO extends CrudRepository<Authority, Long> {

    List<Authority> findAll();
}
