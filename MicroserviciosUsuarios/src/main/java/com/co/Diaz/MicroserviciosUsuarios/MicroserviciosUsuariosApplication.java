package com.co.Diaz.MicroserviciosUsuarios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EnableDiscoveryClient
@SpringBootApplication
@ComponentScan({"com.co.Diaz.MicroserviciosUsuarios","com.diaz.common.user.MicroserviceCommonService.models.entity"})
@EnableJpaRepositories({"com.co.Diaz.MicroserviciosUsuarios.Repository"})
@EntityScan({"com.diaz.common.user.MicroserviceCommonService.models.entity"})
public class MicroserviciosUsuariosApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviciosUsuariosApplication.class, args);
	}

}
