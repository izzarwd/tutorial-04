package com.apap.tu04.service;

import java.util.List;

import com.apap.tu04.model.FlightModel;

/**
 * FlightService
 */
public interface FlightService {
	void addFlight(FlightModel flight);
	void deleteFlight(String flightNumber);
	FlightModel getFlightDetailByflightNumber(String flightNumber);
	List <FlightModel> listAll();
}
