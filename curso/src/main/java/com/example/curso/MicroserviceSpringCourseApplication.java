package com.example.curso;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MicroserviceSpringCourseApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceSpringCourseApplication.class, args);
	}

}
