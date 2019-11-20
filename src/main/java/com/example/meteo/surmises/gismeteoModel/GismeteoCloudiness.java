package com.example.meteo.surmises.gismeteoModel;

import java.io.Serializable;

public class GismeteoCloudiness implements Serializable {
    private Integer percent;
    private Integer type;

    public GismeteoCloudiness() {
    }

    public GismeteoCloudiness(Integer percent, Integer type) {
        this.percent = percent;
        this.type = type;
    }

    public Integer getPercent() {
        return percent;
    }

    public void setPercent(Integer percent) {
        this.percent = percent;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}
