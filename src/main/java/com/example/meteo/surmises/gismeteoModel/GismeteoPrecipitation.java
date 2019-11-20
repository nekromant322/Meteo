package com.example.meteo.surmises.gismeteoModel;

import java.io.Serializable;

public class GismeteoPrecipitation implements Serializable {
    private Integer type;
    private Float amount;
    private Integer intensity;

    public GismeteoPrecipitation() {
    }

    public GismeteoPrecipitation(Integer type, Float amount, Integer intensity) {
        this.type = type;
        this.amount = amount;
        this.intensity = intensity;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }

    public Integer getIntensity() {
        return intensity;
    }

    public void setIntensity(Integer intensity) {
        this.intensity = intensity;
    }
}
