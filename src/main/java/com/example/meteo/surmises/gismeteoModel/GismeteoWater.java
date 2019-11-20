package com.example.meteo.surmises.gismeteoModel;

import java.io.Serializable;

public class GismeteoWater implements Serializable {
    private Float C;

    public GismeteoWater() {
    }

    public GismeteoWater(Float c) {
        C = c;
    }

    public Float getC() {
        return C;
    }

    public void setC(Float c) {
        C = c;
    }
}
