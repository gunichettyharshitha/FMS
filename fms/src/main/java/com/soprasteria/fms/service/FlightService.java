package com.soprasteria.fms.service;

import com.soprasteria.fms.model.Flight;
import org.springframework.http.ResponseEntity;

import java.math.BigInteger;
import java.util.Optional;

public interface FlightService {

    public ResponseEntity<?> addFlight(Flight flight);
    public Iterable<Flight> viewAllFlight();
    public Flight viewFlight(BigInteger flightNumber);
    public Flight modifyFlight(Flight flight);
    public String removeFlight(BigInteger flightNumber);

}

