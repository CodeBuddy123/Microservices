package com.ashsoft;

import java.util.concurrent.ThreadLocalRandom;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherServiceController {
	private String[] weather =new String[]{"sunny", "rainy" , "cloudy" , "windy"};
	
	@RequestMapping("/weather")
	public String getWeatherDetails()
	{
		int rand=ThreadLocalRandom.current().nextInt(weather.length);
		return weather[rand];  //returns random weather
	}
}
