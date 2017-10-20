# Spring Boot / Cloud Workshop Exercise 1

## Goal 

Learn how to:
 
* build a Spring Boot application from scratch
* understand Spring Boot core concepts
  * Auto configuration
  * Starter dependencies
  * Actuators
  * Embedded Tomcat   
* use Spring profiles to show a different message

## Exercise

In this exercise you are going to build your Spring Boot application from scratch.
Depending on your experience you can go through the next steps of this assignment: 

* Create a Spring Boot application Maven project using [https://start.spring.io](https://start.spring.io)
* Create a Rest API that returns a Hello World message using Spring MVC
  * This Hello World message should be loaded from the application.properties or application.yml
* Introduce a Spring profile to return the same message in a different language
  * introduce a profile to support a Dutch "Hallo Wereld" message
  * introduce a profile to support a Portuguese "Olá Mundo" message
* Enable Spring Boot actuators to monitor your application
* Add information to info actuator endpoint like:
  * Application name
  * Version of our Greeting Service
  * Java vendor
  * Java version

## Getting started

https://start.spring.io

Hints:

Starter dependencies:
* spring-boot-starter-web
* spring-boot-starter-actuator

## Actuator endpoints

* Health endpoint: [http://localhost:8080/health](http://localhost:8080/health)
* Info endpoint: [http://localhost:8080/info](http://localhost:8080/info)

## Run the application

First build the project:

```
mvn clean package
```

### Run the executable jar

```
java -jar target/spring-boot-greeting-service-0.0.1-SNAPSHOT.jar
```

Run with a profile:

```
java -jar -Dspring.profiles.active=dutch target/spring-boot-greeting-service-0.0.1-SNAPSHOT.jar
```

### Run using Maven

```
mvn spring-boot:run -Dspring.profiles.active="portugese"
```

## Check your running application

[http://localhost:8080/](http://localhost:8080/)