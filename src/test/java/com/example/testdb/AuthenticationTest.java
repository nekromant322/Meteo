package com.example.testdb;

import com.example.meteo.MeteoApplication;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.*;
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


    @Before
    public void initDefaultUser() throws Exception {
//        auth.inMemoryAuthentication().withUser("test@mail.ru").
//                password(bCryptPasswordEncoder.encode("test")).roles("ADMIN");
    }

    @Test
    public void loginWithDefaultUser() {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
        MultiValueMap<String, String> map = new LinkedMultiValueMap<String, String>();
        map.add("email", "root@mail.ru");
        map.add("password", "root");
        HttpEntity<MultiValueMap<String, String>> request = new HttpEntity<MultiValueMap<String, String>>(map, headers);
        String authenticationUrl = "http://localhost:" + port + "/authenticate";
        ResponseEntity<String> response = restTemplate.postForEntity(authenticationUrl, request, String.class);
        assertThat(response.getStatusCode().value() == 200);
    }

    @Test
    public void loginWithWrongCredentials() {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
        MultiValueMap<String, String> map = new LinkedMultiValueMap<String, String>();
        map.add("email", "1234567890@mail.ru");
        map.add("password", "xcvbnm2345678fghjkjhdsfhk");
        HttpEntity<MultiValueMap<String, String>> request = new HttpEntity<MultiValueMap<String, String>>(map, headers);
        String authenticationUrl = "http://localhost:" + port + "/authenticate";
        ResponseEntity<String> response = restTemplate.postForEntity(authenticationUrl, request, String.class);
        assertThat(response.getStatusCode().value() != 200);
    }
}
