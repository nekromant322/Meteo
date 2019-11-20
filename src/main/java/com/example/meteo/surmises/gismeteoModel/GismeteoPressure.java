package com.example.meteo.surmises.gismeteoModel;

import java.io.Serializable;

public class GismeteoPressure implements Serializable {
    private Integer mm_hg_atm;

    public GismeteoPressure() {
    }

    public GismeteoPressure(Integer mm_hg_atm) {
        this.mm_hg_atm = mm_hg_atm;
    }

    public Integer getMm_hg_atm() {
        return mm_hg_atm;
    }

    public void setMm_hg_atm(Integer mm_hg_atm) {
        this.mm_hg_atm = mm_hg_atm;
    }
}
