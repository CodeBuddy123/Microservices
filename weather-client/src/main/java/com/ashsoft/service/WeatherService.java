package com.ashsoft.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service  //@HystixCommand should be used in service or component class
public class WeatherService {
	  @Autowired
      private RestTemplate template;
      
      @HystrixCommand(fallbackMethod = "unknown") //Monitors request-response cycle
      public String getWeather()
      {
    	  return template.getForEntity("http://weather-service/weather",String.class).getBody(); //request sent to weather-service app
      }
      
      public String unknown() //this method is executed when hystrix opens the circuit to avoid cascading failures in the app
      {
    	  return "unknown";
      }
}
