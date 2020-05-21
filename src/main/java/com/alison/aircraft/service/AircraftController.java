package com.alison.aircraft.service;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author AAPEREI
 *
 *         API Controller class which handles all HTTP requests
 */
@RestController
public class AircraftController {

	private static final String AIRCRAFT_NAME_TEMPLATE = "ALISON-%s";
	private final AtomicLong counter = new AtomicLong();
	
	@Autowired
	private AircraftService aircraftService;
	/**
	 * 
	 * Returns a sample aircraft object
	 * 
	 * @param name              aircraft name
	 * @param weight            aircraft weight
	 * @param numberOfSeats     number of seats
	 * @param rangeInKilometers range in kilometers
	 * @return {link Aircraft} object
	 */
	@GetMapping("/sample-aircraft")
	public Aircraft getSampleAircraft(@RequestParam(value = "name", defaultValue = "390") String name,
			@RequestParam(value = "weight", defaultValue = "1000") Double weight,
			@RequestParam(value = "numberOfSeats", defaultValue = "100") int numberOfSeats,
			@RequestParam(value = "rangeInKilometers", defaultValue = "5000") int rangeInKilometers) {
		return new Aircraft(counter.incrementAndGet(), String.format(AIRCRAFT_NAME_TEMPLATE, name), weight,
				numberOfSeats, rangeInKilometers);
	}
	
	@GetMapping("/all-aircrafts")
	public List<Aircraft> getAllAircrafts() {
		return aircraftService.getAllAircrafts();
	}
}