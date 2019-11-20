package com.example.meteo.surmises.gismeteoModel;

import java.io.Serializable;

public class GismeteoDate implements Serializable {
    private String UTC;
    private int unix;
    private String local;
    private int time_zone_offset;

    public GismeteoDate() {
    }

    public GismeteoDate(String UTC, int unix, String local, int time_zone_offset) {
        this.UTC = UTC;
        this.unix = unix;
        this.local = local;
        this.time_zone_offset = time_zone_offset;
    }

    public String getUTC() {
        return UTC;
    }

    public void setUTC(String UTC) {
        this.UTC = UTC;
    }

    public int getUnix() {
        return unix;
    }

    public void setUnix(int unix) {
        this.unix = unix;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public int getTime_zone_offset() {
        return time_zone_offset;
    }

    public void setTime_zone_offset(int time_zone_offset) {
        this.time_zone_offset = time_zone_offset;
    }
}
