package com.alison.aircraft.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AircraftService {
	
	@Autowired
	private AircraftRepository aircraftRepository;
	
	public List<Aircraft> getAllAircrafts(){
		
		return aircraftRepository.findAll();
	}
}
