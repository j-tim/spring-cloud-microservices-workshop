# Spring Boot / Cloud Workshop Exercise 2

## Goal

* Build a Spring Cloud config server using Spring Boot
* Serve the "Greeting" service configuration using the config server
* Load the configuration for your "Greeting" service from the config server 

## Getting started

To get your started we turned the project into a multi maven module for you!

* [http://projects.spring.io/spring-cloud/](http://projects.spring.io/spring-cloud/)
* [https://start.spring.io](https://start.spring.io)

Hints:

* Create a new Spring Boot application in a separate module
* Introduce a `bootstrap.yml`
* Use the Spring Cloud BOM (Bill of materials)

Starter dependencies:

## Run the applications

First build the project:

```
mvn clean package
```

### Run the executable jar

```
java -jar spring-boot-greeting-service/target/spring-boot-greeting-service-0.0.1-SNAPSHOT.jar
```

Run with a profile:

```
java -jar -Dspring.profiles.active=dutch spring-boot-greeting-service/target/spring-boot-greeting-service-0.0.1-SNAPSHOT.jar
```

### Run using Maven

With specific Portuguese profile

```
cd spring-boot-greeting-service
mvn spring-boot:run -Dspring.profiles.active=portuguese
```

## Check your running application

[http://localhost:8080/](http://localhost:8080/)