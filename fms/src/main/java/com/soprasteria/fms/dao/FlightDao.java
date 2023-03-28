package com.soprasteria.fms.dao;

import com.soprasteria.fms.model.Flight;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

@Repository
public interface FlightDao extends CrudRepository<Flight,BigInteger> {
}
