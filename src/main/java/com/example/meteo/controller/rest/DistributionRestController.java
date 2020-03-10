package com.example.meteo.controller.rest;

import com.example.meteo.dto.SquareDTO;
import org.springframework.data.geo.Point;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class DistributionRestController {

    @GetMapping("/makeDistribution")
    public Map<Point, Integer> makeDistribution(@RequestParam SquareDTO squareDTO, int measureCount) {

        //Kirill
        return null;
    }
}
