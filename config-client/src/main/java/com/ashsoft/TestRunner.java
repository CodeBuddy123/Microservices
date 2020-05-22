package com.ashsoft;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class TestRunner implements ApplicationRunner {
    
	@Autowired
	Environment env;
	
	@Value(" ${course.name}")
	String courseNameProperty; //This variable is injected with value of course.name
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		System.out.println(env);
		/*
		  Reading properties from configuration files
		  System.out.println(env.getProperty("course.name"));
		  System.out.println(env.getProperty("course.cost"));
		  System.out.println(env.getProperty("app.client"));
		 */
		System.out.println(courseNameProperty); //another way of reading the property
	}

}
