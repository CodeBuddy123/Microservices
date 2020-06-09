package com.ashsoft;

import java.util.Hashtable;
import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringCloudDataservice1Application {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(SpringCloudDataservice1Application.class);
	
	
	public static void main(String[] args) {
		SpringApplication.run(SpringCloudDataservice1Application.class, args);
	}
    
	@RequestMapping("/customer/{cid}/contactdetails")
	public String getCustomerDetails(@PathVariable Integer cid) throws InterruptedException
	{   
		LOGGER.info("entered getCustomerContactDetails ( DataService1) ");
	
		//adding arbitrary latency
		Random r = new Random();
		int multiplier =r.nextInt(5)* 1000;
		System.out.println("Multiplier "+multiplier);
		Thread.sleep(1000);
		
		Hashtable<Integer,String> customers = new Hashtable<>();
		customers.put(101,"Ashish");
		customers.put(102,"Sachin");
		customers.put(103,"Yuvraj");
		customers.put(104,"Rajesh");
		
		String result=customers.get(cid);
		LOGGER.info("exiting getCustomerContactDetails ( DataService1)");
		return result;  //returns customer name for a given id
		
	}
}
