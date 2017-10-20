package nl.workshop.cloud.serviceregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpringCloudServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudServiceRegistryApplication.class, args);
	}
}
