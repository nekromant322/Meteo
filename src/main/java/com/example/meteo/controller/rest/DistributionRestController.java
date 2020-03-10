package com.example.meteo.controller.rest;

import com.example.meteo.dto.Point;
import com.example.meteo.dto.SquareDTO;
import com.example.meteo.model.weather.Sys;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class DistributionRestController {

    @GetMapping("/makeDistribution")
    public Map<Point, Double> makeDistribution(@RequestParam SquareDTO squareDTO, int measureCount) {
        List<Point> points = squareDTO.getAngles();
        Point point1 = points.get(0); // left-top corner
        Point point2 = points.get(1); // right-bottom
        double width = point1.getLat() - point2.getLat();
        double height = point2.getLon() - point1.getLon();
        double square = width * height;
        double perimeter = (width + height) * 2;
        double rad = 0.5 * Math.sqrt(square / measureCount);
        HashMap<Point, Double> circlePoints = new HashMap<>();
        double x=point1.getLat()+rad;
        double y=point1.getLon()+rad;
        while (y+rad<point2.getLon()) {
            while(x-rad>point2.getLat()) {
                circlePoints.put(new Point(x,y),rad);
                x-=rad;
            }
            y+=rad;
        }
        return circlePoints;
    }
}
