package com.ashsoft.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ashsoft.service.WeatherService;

@RestController
public class WeatherServiceController {
	 @Autowired
	 private WeatherService service;
	 
	 @RequestMapping("/current/weather")
	 public String getWeather()
	 {
		 return "Now the Weather is "+service.getWeather();
	 }
}
