package com.example.meteo.dto;

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
}
