package nl.workshop.cloud.greetingservice.resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Please note this is a very naive implementation of a REST API.
 * But it is just there go get started.
 */
@RestController
@RequestMapping("/greeting")
public class GreetingResource {

  @Value("${greeting.message}")
  private String message;

  @GetMapping
  public Greeting sayHello() {
    return new Greeting(message);
  }
}
