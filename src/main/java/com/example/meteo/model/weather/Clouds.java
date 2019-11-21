
package com.example.meteo.model.weather;

import java.io.Serializable;

public class Clouds implements Serializable
{

    private Integer all;
    private final static long serialVersionUID = 8852868845898850336L;

    public Integer getAll() {
        return all;
    }

    public void setAll(Integer all) {
        this.all = all;
    }

}
