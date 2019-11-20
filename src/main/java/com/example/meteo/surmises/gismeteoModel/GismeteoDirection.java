package com.example.meteo.surmises.gismeteoModel;

import java.io.Serializable;

public class GismeteoDirection implements Serializable {
    private Integer degree;
    private Integer scale_8;

    public GismeteoDirection() {
    }

    public GismeteoDirection(Integer degree, Integer scale_8) {
        this.degree = degree;
        this.scale_8 = scale_8;
    }

    public Integer getDegree() {
        return degree;
    }

    public void setDegree(Integer degree) {
        this.degree = degree;
    }

    public Integer getScale_8() {
        return scale_8;
    }

    public void setScale_8(Integer scale_8) {
        this.scale_8 = scale_8;
    }
}
