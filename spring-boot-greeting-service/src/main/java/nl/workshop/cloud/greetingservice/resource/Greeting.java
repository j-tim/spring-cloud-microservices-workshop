package nl.workshop.cloud.greetingservice.resource;

import lombok.Data;

@Data
class Greeting {

  private String message;

  Greeting(String message) {
    this.message = message;
  }
}
