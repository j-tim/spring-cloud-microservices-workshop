package nl.workshop.cloud.greetingservice.resource;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Please note this is a very naive implementation of a REST API.
 * But it is just there go get started.
 */
@Slf4j
@RestController
@RequestMapping("/greeting")
public class GreetingResource {

  @Value("${greeting.message}")
  private String message;

  @GetMapping
  public Greeting sayHello() {
    return new Greeting(message);
  }

  @PostMapping
  public ResponseEntity<String> triggerMyPostFilter(@RequestBody String body) {
    log.info("I should trigger the response filter to execute, body: {}", body);
    return ResponseEntity.ok("EUREKA, it works! yeah, we know, a pun is definitely the lowest level of humor.");
  }

}
