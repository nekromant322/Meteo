package com.example.meteo.model;



import com.example.meteo.model.weather.WeatherResponse;

import javax.persistence.*;

@Entity
public class WeatherSituation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private Double lon;

    @Column
    private Double lat;

    @Column
    private Double temp;

    @Column
    private Integer pressure;

    @Column
    private Integer humidity;

    @Column
    private Double windSpeed;

    @Column
    private Integer clouds;

    public WeatherSituation() {
    }
    public WeatherSituation(WeatherResponse weatherResponse) {
        this.lon = weatherResponse.getCoord().getLon();
        this.lat = weatherResponse.getCoord().getLat();
        this.temp = weatherResponse.getMain().getTemp();
        this.pressure = weatherResponse.getMain().getPressure();
        this.humidity = weatherResponse.getMain().getHumidity();
        this.windSpeed = weatherResponse.getWind().getSpeed();
        this.clouds = weatherResponse.getClouds().getAll();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getLon() {
        return lon;
    }

    public void setLon(Double lon) {
        this.lon = lon;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getTemp() {
        return temp;
    }

    public void setTemp(Double temp) {
        this.temp = temp;
    }

    public Integer getPressure() {
        return pressure;
    }

    public void setPressure(Integer pressure) {
        this.pressure = pressure;
    }

    public Integer getHumidity() {
        return humidity;
    }

    public void setHumidity(Integer humidity) {
        this.humidity = humidity;
    }

    public Double getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(Double windSpeed) {
        this.windSpeed = windSpeed;
    }

    public Integer getClouds() {
        return clouds;
    }

    public void setClouds(Integer clouds) {
        this.clouds = clouds;
    }
}
