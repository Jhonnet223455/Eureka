package com.example.curso;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableDiscoveryClient
@SpringBootApplication
@ComponentScan({"com.example.curso","com.diaz.common.user.MicroserviceCommonService.models.entity"})
@EnableJpaRepositories({"com.example.curso.repository"})
@EntityScan({"com.diaz.common.user.MicroserviceCommonService.models.entity"})
public class MicroserviceSpringCourseApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceSpringCourseApplication.class, args);
	}

}
