package com.alison.aircraft;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @author AAPEREI
 * 
 * Starts SpringBoot Application
 *
 */
@SpringBootApplication
public class AircraftApplication extends SpringBootServletInitializer {
	
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(AircraftApplication.class);
    }
    
	public static void main(String[] args) {
		SpringApplication.run(AircraftApplication.class, args);
	}

}
