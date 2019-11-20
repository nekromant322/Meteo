package com.example.meteo.surmises.gismeteoModel;

import java.io.Serializable;

public class GismeteoTemperature implements Serializable {

    private GismeteoAir air;
    private GismeteoComfort comfort;
    private GismeteoWater water;

    public GismeteoTemperature() {
    }

    public GismeteoTemperature(GismeteoAir air, GismeteoComfort comfort, GismeteoWater water) {
        this.air = air;
        this.comfort = comfort;
        this.water = water;
    }

    public GismeteoAir getAir() {
        return air;
    }

    public void setAir(GismeteoAir air) {
        this.air = air;
    }

    public GismeteoComfort getComfort() {
        return comfort;
    }

    public void setComfort(GismeteoComfort comfort) {
        this.comfort = comfort;
    }

    public GismeteoWater getWater() {
        return water;
    }

    public void setWater(GismeteoWater water) {
        this.water = water;
    }
}
