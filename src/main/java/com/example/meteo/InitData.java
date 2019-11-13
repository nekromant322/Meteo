package com.example.meteo;

import com.example.meteo.model.Authority;
import com.example.meteo.model.User;
import com.example.meteo.service.AuthorityService;
import com.example.meteo.service.UserService;

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
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    public void initData() {

        initUserAndRoles();


    }

    private void initUserAndRoles(){
        Authority adminAuthority = new Authority("ROLE_ADMIN");
        Authority userAuthority = new Authority("ROLE_USER");
        authorityService.insert(adminAuthority);
        authorityService.insert(userAuthority);

        List<Authority> authorities = new ArrayList<Authority>();
        authorities.add(adminAuthority);
        userService.insert(new User("1@mail.ru",bCryptPasswordEncoder.encode("1"), authorities));


    }
}
