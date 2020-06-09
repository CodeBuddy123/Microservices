package com.ashsoft;

import java.util.Hashtable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringCloudDataservice2Application {
	
    private static final Logger LOGGER = LoggerFactory.getLogger(SpringCloudDataservice2Application.class);
    
	public static void main(String[] args) {
		SpringApplication.run(SpringCloudDataservice2Application.class, args);
	}
    
	@RequestMapping("/customer/{cid}/vehicledetails")
	public String getVehicleDetails(@PathVariable Integer cid)
	{
		LOGGER.info("entered getCustomerVehicleDetails ( DataService2)");
		Hashtable<Integer, String> vehicles = new Hashtable<Integer, String>();
		vehicles.put(101, "Lincoln Continental; Plate SNUG30");
		vehicles.put(102, "Chevrolet Camaro; Plate R7TYR43");
		vehicles.put(103, "Volkswagen Beetle; Plate 6CVI3E2");
		vehicles.put(104, "Mercedez Benz; Plate 6D87RE");
		String result = vehicles.get(cid);
		LOGGER.info("exiting getCustomerVehicleDetails ( DataService2)");
		return result;
	}
}
