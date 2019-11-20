package com.example.meteo.surmises.gismeteoModel;

import java.io.Serializable;

public class GismeteoComfort implements Serializable {
    private Float C;

    public GismeteoComfort() {
    }

    public GismeteoComfort(Float c) {
        C = c;
    }

    public Float getC() {
        return C;
    }

    public void setC(Float c) {
        C = c;
    }
}
