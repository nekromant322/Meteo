
package com.example.meteo.model.weather;

import java.io.Serializable;

public class Coord implements Serializable
{

    private Double lon;
    private Double lat;
    private final static long serialVersionUID = -1566721089347914581L;

    public Double getLon() {
        return lon;
    }

    public void setLon(Double lon) {
        this.lon = lon;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

}
