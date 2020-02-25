package com.apap.tu04.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apap.tu04.model.FlightModel;
import com.apap.tu04.repository.FlightDb;

/**
 * @author ASUS
 *
 */
@Service
@Transactional
public class FlightServiceImpl implements FlightService{
	@Autowired
	private FlightDb flightDb;
	
	@Override
	public void addFlight(FlightModel flight) {
		flightDb.save(flight);
	}
	
	@Override
	public void deleteFlight(String flightNumber) {
		flightDb.deleteByFlightNumber(flightNumber);
	}
	
	@Override
	public FlightModel getFlightDetailByflightNumber(String flightNumber) {
		return flightDb.findByFlightNumber(flightNumber);
	}
	
	@Override
	public List <FlightModel> listAll() {
        return flightDb.findAll();
    }
}
