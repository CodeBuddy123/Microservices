package com.ashsoft;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeServiceController {
	@RequestMapping("/")
    public String welcomeService()
    {
    	return "Welcome to MicroServices";
    }
} 
