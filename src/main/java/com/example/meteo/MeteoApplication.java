package com.example.meteo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource({
        "classpath:config/datasource.properties",
        "classpath:config/jpa.properties",
})
public class MeteoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MeteoApplication.class, args);
    }

    //delete "//" to enable init userroles and users to base
   @Bean(initMethod = "initData")
    public InitData initialData() {
        return new InitData();
    }
}
