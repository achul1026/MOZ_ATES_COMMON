package com.moz.ates.traffic.common;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource(value = "application.properties",ignoreResourceNotFound = true)
public class CommonApplication {

	
    public static void main(String[] args) {
        SpringApplication.run(CommonApplication.class, args);
    } 

}
