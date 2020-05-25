package com.ashsoft;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TimeServiceController {
    
    @Value("${server.port}")
	private int port;
    
    @RequestMapping("/")
    public String getTime()
    {   
    	return "Now the time is "+ new Date().toString()+" service running on "+port;
    }
}
