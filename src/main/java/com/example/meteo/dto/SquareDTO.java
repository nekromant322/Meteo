package com.example.meteo.dto;

import java.util.List;

public class SquareDTO {

    private Point botRightPoint;
    private Point upperLeftPoint;
    private int measureCount;

    public SquareDTO() {
    }

    public Point getUpperLeftPoint() {
        return upperLeftPoint;
    }

    public void setUpperLeftPoint(Point upperLeftPoint) {
        this.upperLeftPoint = upperLeftPoint;
    }

    public Point getBotRightPoint() {
        return botRightPoint;
    }

    public void setBotRightPoint(Point botRightPoint) {
        this.botRightPoint = botRightPoint;
    }

    public int getMeasureCount() {
        return measureCount;
    }

    public void setMeasureCount(int measureCount) {
        this.measureCount = measureCount;
    }
}
