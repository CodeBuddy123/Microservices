package com.ashsoft;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class TimeServiceRibbonApplication {

	public static void main(String[] args) {
		SpringApplication.run(TimeServiceRibbonApplication.class, args);
	}

}
