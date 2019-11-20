package com.example.meteo.surmises.gismeteoModel;

import java.io.Serializable;

public class GismeteoAir implements Serializable {
    private Float C;

    public GismeteoAir() {
    }

    public GismeteoAir(Float c) {
        C = c;
    }

    public Float getC() {
        return C;
    }

    public void setC(Float c) {
        C = c;
    }
}
