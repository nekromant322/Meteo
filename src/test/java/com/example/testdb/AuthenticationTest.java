package com.example.testdb;

import com.example.meteo.MeteoApplication;
import com.example.meteo.dao.AuthorityDAO;
import com.example.meteo.dao.UserDAO;
import com.example.meteo.model.User;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = MeteoApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class AuthenticationTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Autowired
    AuthenticationManagerBuilder auth;

    @Autowired
    BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    private UserDAO userDAO;

    @Autowired
    private AuthorityDAO authorityDAO;



    @Before
    public void initDefaultUser() throws Exception {
//        auth.inMemoryAuthentication().withUser("test@mail.ru").
//                password(bCryptPasswordEncoder.encode("test")).roles("ADMIN");
    }

    @Test
    public void loginWithDefaultUser() {
        String authenticationUrl = "http://localhost:" + port + "/authenticate";
        ResponseEntity<String> response = restTemplate.postForEntity(authenticationUrl, createRequestToLogin("root@mail.ru", "root"), String.class);
        Assert.assertEquals(200, response.getStatusCode().value());
    }

    @Test
    public void loginWithWrongCredentials() {
        String authenticationUrl = "http://localhost:" + port + "/authenticate";
        ResponseEntity<String> response = restTemplate.postForEntity(authenticationUrl, createRequestToLogin("asdasdasdasd@mail.ru","dfsgsht64yhth6rtyhn5herbf"), String.class);
        Assert.assertNotEquals(200, response.getStatusCode().value());
    }

    @Test
    public void loginWithDBCredentials() {
        final String EMAIL = "littlePony@mail.ru";
        final String PASSWORD = "littlePony";
        User user = new User(EMAIL, bCryptPasswordEncoder.encode(PASSWORD), authorityDAO.findAll());
        userDAO.save(user);

        String authenticationUrl = "http://localhost:" + port + "/authenticate";
        ResponseEntity<String> response = restTemplate.postForEntity(authenticationUrl, createRequestToLogin(EMAIL,PASSWORD), String.class);
        Assert.assertEquals(200, response.getStatusCode().value());
    }


    private HttpEntity<MultiValueMap<String, String>> createRequestToLogin(String email, String password) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
        MultiValueMap<String, String> map = new LinkedMultiValueMap<String, String>();
        map.add("email", email);
        map.add("password", password);
        HttpEntity<MultiValueMap<String, String>> request = new HttpEntity<MultiValueMap<String, String>>(map, headers);
        return request;
    }

}
