package com.ashsoft;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;

@RestController
public class HelloController {
	@Autowired
	private EurekaClient client;
	@Autowired
	private RestTemplateBuilder builder;
    
	@RequestMapping("/")
	public String hiService()
	{
		RestTemplate template=builder.build();
		InstanceInfo info=client.getNextServerFromEureka("hello-service", false); //first arg is name of the service which we want to discover,second arg is if request is secured or not
		String baseUrl=info.getHomePageUrl();
		ResponseEntity<String> response= template.exchange(baseUrl, HttpMethod.GET, null, String.class);
		
		return response.getBody();
	}
}
