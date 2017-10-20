package nl.workshop.cloud.greetingservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringBootGreetingServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootGreetingServiceApplication.class, args);
	}
}
