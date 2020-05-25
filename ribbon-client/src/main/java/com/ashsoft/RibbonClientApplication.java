package com.ashsoft;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
public class RibbonClientApplication {
    
	public static void main(String[] args) {
		SpringApplication.run(RibbonClientApplication.class, args);
	}
	
	@Bean  //indicates that method returns a bean
	@LoadBalanced //ensures RestTemplate proxy object,where RestTemplateInterceptor supports ribbon for loadbalance
	public RestTemplate restTemplate()
	{
		return new RestTemplate();  //returns RestTemplate object
	}
}
