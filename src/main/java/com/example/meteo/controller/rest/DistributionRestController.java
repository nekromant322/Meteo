package com.example.meteo.controller.rest;

import com.example.meteo.dto.Point;
import com.example.meteo.dto.SquareDTO;
import com.example.meteo.model.weather.Sys;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/distributions/")
public class DistributionRestController {

    @PostMapping("/make")
    public Map<Point, Double> makeDistribution(@RequestBody SquareDTO squareDTO) {

        Point point1 = squareDTO.getUpperLeftPoint(); // left-top corner
        Point point2 = squareDTO.getBotRightPoint(); // right-bottom
        double width = point1.getLat() - point2.getLat();
        double height = point2.getLon() - point1.getLon();
        double square = width * height;
        double rad = 0.5 * Math.sqrt(square / squareDTO.getMeasureCount());
        HashMap<Point, Double> circlePoints = new HashMap<>();
        double x = point1.getLat() + rad;
        double y = point1.getLon() - rad;
        while (y > point2.getLon()) {
            while (x < point2.getLat()) {
                circlePoints.put(new Point(x, y), rad);
                x += 2 * rad;
            }
            y -= 2 * rad;
            x = point1.getLat() + rad;
        }
        return circlePoints;
    }
}
