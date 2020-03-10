package com.example.meteo;

import java.util.List;

public class SquareDTO {

    private List<Point> angles;

    public SquareDTO() {
    }

    public SquareDTO(List<Point> angles) {
        this.angles = angles;
    }

    public List<Point> getAngles() {
        return angles;
    }

    public void setAngles(List<Point> angles) {
        this.angles = angles;
    }

    class Point {
        private double lat;
        private double lon;

        public Point() {
        }

        public Point(double lat, double lon) {
            this.lat = lat;
            this.lon = lon;
        }

        public double getLat() {
            return lat;
        }

        public void setLat(double lat) {
            this.lat = lat;
        }

        public double getLon() {
            return lon;
        }

        public void setLon(double lon) {
            this.lon = lon;
        }
    }

}
