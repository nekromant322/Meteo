package com.example.meteo.surmises.gismeteoModel;

import java.io.Serializable;

public class GismeteoStorm implements Serializable {
    private Boolean prediction;

    public GismeteoStorm() {
    }

    public GismeteoStorm(Boolean prediction) {
        this.prediction = prediction;
    }

    public Boolean getPrediction() {
        return prediction;
    }

    public void setPrediction(Boolean prediction) {
        this.prediction = prediction;
    }
}
