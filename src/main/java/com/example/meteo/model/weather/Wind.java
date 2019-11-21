
package com.example.meteo.model.weather;

import java.io.Serializable;

public class Wind implements Serializable
{

    private Double speed;
    private Integer deg;
    private final static long serialVersionUID = 7678222895486215141L;

    public Double getSpeed() {
        return speed;
    }

    public void setSpeed(Double speed) {
        this.speed = speed;
    }

    public Integer getDeg() {
        return deg;
    }

    public void setDeg(Integer deg) {
        this.deg = deg;
    }

}
