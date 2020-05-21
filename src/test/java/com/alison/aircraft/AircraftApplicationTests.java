package com.alison.aircraft;


import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.alison.aircraft.service.Aircraft;
import com.alison.aircraft.service.AircraftRepository;

@SpringBootTest(classes = AircraftApplication.class)
class AircraftApplicationTests {
	
	@Autowired
	AircraftRepository aircraftRepository;
	
	@Test
	void contextLoads() {
	}
	
	
	@Test
	public void getAllAircracftsIntegrationTest() {
		List<Aircraft> aircrafts = aircraftRepository.findAll();
		assertEquals(true, aircrafts.size() > 0);
	}
	
}
