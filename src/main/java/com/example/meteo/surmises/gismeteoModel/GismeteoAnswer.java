package com.example.meteo.surmises.gismeteoModel;

import java.io.Serializable;

public class GismeteoAnswer implements Serializable {
    private String kind;
    private GismeteoDate date;
    private GismeteoTemperature temperature;
    private GismeteoDescription description;
    private GismeteoHumidity humidity;
    private GismeteoPressure pressure;
    private GismeteoCloudiness cloudiness;
    private GismeteoStorm storm;
    private GismeteoPrecipitation precipitation;
    private Integer phenomenon;
    private String icon;
    private Integer gm;
    private GismeteoWind wind;

    public GismeteoAnswer() {
    }

    public GismeteoAnswer(String kind, GismeteoDate date, GismeteoTemperature temperature, GismeteoDescription description, GismeteoHumidity humidity, GismeteoPressure pressure, GismeteoCloudiness cloudiness, GismeteoStorm storm, GismeteoPrecipitation precipitation, Integer phenomenon, String icon, Integer gm, GismeteoWind wind) {
        this.kind = kind;
        this.date = date;
        this.temperature = temperature;
        this.description = description;
        this.humidity = humidity;
        this.pressure = pressure;
        this.cloudiness = cloudiness;
        this.storm = storm;
        this.precipitation = precipitation;
        this.phenomenon = phenomenon;
        this.icon = icon;
        this.gm = gm;
        this.wind = wind;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public GismeteoDate getDate() {
        return date;
    }

    public void setDate(GismeteoDate date) {
        this.date = date;
    }

    public GismeteoTemperature getTemperature() {
        return temperature;
    }

    public void setTemperature(GismeteoTemperature temperature) {
        this.temperature = temperature;
    }

    public GismeteoDescription getDescription() {
        return description;
    }

    public void setDescription(GismeteoDescription description) {
        this.description = description;
    }

    public GismeteoHumidity getHumidity() {
        return humidity;
    }

    public void setHumidity(GismeteoHumidity humidity) {
        this.humidity = humidity;
    }

    public GismeteoPressure getPressure() {
        return pressure;
    }

    public void setPressure(GismeteoPressure pressure) {
        this.pressure = pressure;
    }

    public GismeteoCloudiness getCloudiness() {
        return cloudiness;
    }

    public void setCloudiness(GismeteoCloudiness cloudiness) {
        this.cloudiness = cloudiness;
    }

    public GismeteoStorm getStorm() {
        return storm;
    }

    public void setStorm(GismeteoStorm storm) {
        this.storm = storm;
    }

    public GismeteoPrecipitation getPrecipitation() {
        return precipitation;
    }

    public void setPrecipitation(GismeteoPrecipitation precipitation) {
        this.precipitation = precipitation;
    }

    public Integer getPhenomenon() {
        return phenomenon;
    }

    public void setPhenomenon(Integer phenomenon) {
        this.phenomenon = phenomenon;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Integer getGm() {
        return gm;
    }

    public void setGm(Integer gm) {
        this.gm = gm;
    }

    public GismeteoWind getWind() {
        return wind;
    }

    public void setWind(GismeteoWind wind) {
        this.wind = wind;
    }
}
