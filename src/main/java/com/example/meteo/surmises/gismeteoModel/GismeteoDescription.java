package com.example.meteo.surmises.gismeteoModel;

import java.io.Serializable;

public class GismeteoDescription implements Serializable {
    private String full;

    public GismeteoDescription() {
    }

    public GismeteoDescription(String full) {
        this.full = full;
    }

    public String getFull() {
        return full;
    }

    public void setFull(String full) {
        this.full = full;
    }
}
