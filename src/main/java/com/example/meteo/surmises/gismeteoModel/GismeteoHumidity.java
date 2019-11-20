package com.example.meteo.surmises.gismeteoModel;

import java.io.Serializable;

public class GismeteoHumidity implements Serializable {
    private Integer percent;

    public GismeteoHumidity() {
    }

    public GismeteoHumidity(Integer percent) {
        this.percent = percent;
    }

    public Integer getPercent() {
        return percent;
    }

    public void setPercent(Integer percent) {
        this.percent = percent;
    }
}
