package com.alison.aircraft.service;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author AAPEREI
 *
 *Aircraft entity class
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "Aircraft")
@Table(name = "aircraft")
public class Aircraft {
	
	@Id
	private Long id;
	private String name;
	private Double weight;
	private Integer numberOfSeats;
	private Integer rangeInKilometers;
	
}