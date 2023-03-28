package com.soprasteria.fms.controller;

import com.soprasteria.fms.model.Flight;
import com.soprasteria.fms.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;

@RestController
@RequestMapping("/flight")
public class FlightController {

    @Autowired
    FlightService flightService;

    @PostMapping("/addFlight")
    public void addFlight(@RequestBody Flight flight){
        flightService.addFlight(flight);
    }

    @GetMapping("/allFlight")
    public Iterable<Flight> viewAllFlight() {
        return flightService.viewAllFlight();
    }
    @GetMapping("/viewFlight/{id}")
    public Flight viewFlight(@PathVariable("id") BigInteger flightNo) {
        return flightService.viewFlight(flightNo);
    }
    @PutMapping("/updateFlight")
    public void modifyFlight(@RequestBody Flight flight) {
        flightService.modifyFlight(flight);
    }
    @DeleteMapping("/deleteFlight/{id}")
    public void removeFlight(@PathVariable("id") BigInteger flightNo) {
        flightService.removeFlight(flightNo);
    }
}
