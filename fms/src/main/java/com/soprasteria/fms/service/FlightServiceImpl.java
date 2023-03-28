package com.soprasteria.fms.service;

import com.soprasteria.fms.dao.FlightDao;
import com.soprasteria.fms.model.Flight;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.Optional;

@Service
public class FlightServiceImpl implements FlightService {
    @Autowired
    FlightDao flightDao;

    @Override // add a flight
    public ResponseEntity<Flight> addFlight(Flight flight) {
        flightDao.save(flight);
        return new ResponseEntity<Flight>(flight, HttpStatus.OK);
    }

    @Override // view all flights
    public Iterable<Flight> viewAllFlight() {
       return flightDao.findAll();
    }

    @Override
    public Flight viewFlight(BigInteger flightNumber) {
        Optional<Flight> findById = flightDao.findById(flightNumber);
            return findById.get();
    }


    @Override // modify/update a flight
    public Flight modifyFlight(Flight flight) {
        Optional<Flight> findById = flightDao.findById(flight.getFlightNo());
        flightDao.save(flight);
        return flight;
    }

    @Override // delete a flight
    public String removeFlight(BigInteger flightNumber) {
        Optional<Flight> findById = flightDao.findById(flightNumber);
        flightDao.deleteById(flightNumber);
        return "Flight removed!!";
    }
}
