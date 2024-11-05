package microservicesEureka.JMDF;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class JmdfApplication {

	public static void main(String[] args) {
		SpringApplication.run(JmdfApplication.class, args);
	}

}
