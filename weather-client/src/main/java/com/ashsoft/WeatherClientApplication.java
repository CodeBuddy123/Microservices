package com.ashsoft;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableCircuitBreaker  //Activates Circuit Breaker in application
@EnableDiscoveryClient
public class WeatherClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeatherClientApplication.class, args);
	}
	
	@Bean
	@LoadBalanced //ensures RestTemplate is decorated with Ribbon,load balancer
	public RestTemplate restTemplate()
	{
		return new RestTemplate();
	}

}
