package com.ashsoft;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RibbonClientController {
  
	@Autowired
	private RestTemplate template;
	@RequestMapping("/")
	public String callService()
	{
		//System.out.println(template.getClass().getName());
		
		String body=template.getForObject("http://TIME-SERVICE", String.class); //returns single instance of time-service after loadbalancing
		
		return body;
	}
}
