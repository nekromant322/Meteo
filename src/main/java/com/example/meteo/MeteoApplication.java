package com.example.meteo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.PostMapping;

import javax.annotation.PostConstruct;

@SpringBootApplication
@PropertySource({
        "classpath:config/datasource.properties",
        "classpath:config/jpa.properties",
        "classpath:config/weather.properties",
        "classpath:config/SMSC.properties"
})
public class MeteoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MeteoApplication.class, args);
    }

    //delete "//" to enable init database with default values
    //@PostConstruct
    //@Bean(initMethod = "initData")
    public InitData initialData() {
        return new InitData();
    }
}

//TODO ограничение области по пресету https://tech.yandex.ru/maps/jsbox/2.1/restrict_map_area
//TODO описание для области https://tech.yandex.ru/maps/jsbox/2.1/balloon_ajax
//TODO Выбор нужных точек для отслеживания https://tech.yandex.ru/maps/jsbox/2.1/geo_object_collection
//TODO фильтрация слоев https://tech.yandex.ru/maps/jsbox/2.1/geoobjects_menu

//TODO DTO конвертеры https://www.baeldung.com/spring-type-conversions



