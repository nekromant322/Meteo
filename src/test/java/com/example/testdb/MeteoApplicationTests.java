package com.example.testdb;

import com.example.meteo.MeteoApplication;
import com.example.meteo.controller.MainController;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertThat;

@RunWith(SpringRunner.class)

@SpringBootTest(classes = MeteoApplication.class)
public class MeteoApplicationTests {

    @Autowired
    private MainController mainController;

    @Test
    public void contextLoads() {

    }
    @Test
    public void controllerResponse() {
        assertThat(mainController).isNotNull();
        Assert.assertNotNull("login", mainController.showLoginPage());
    }

}
