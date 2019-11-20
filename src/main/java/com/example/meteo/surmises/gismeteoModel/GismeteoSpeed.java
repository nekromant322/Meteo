package com.example.meteo.surmises.gismeteoModel;

import java.io.Serializable;

public class GismeteoSpeed implements Serializable {
    private Float m_s;

    public GismeteoSpeed() {
    }

    public GismeteoSpeed(Float m_s) {
        this.m_s = m_s;
    }

    public Float getM_s() {
        return m_s;
    }

    public void setM_s(Float m_s) {
        this.m_s = m_s;
    }
}
