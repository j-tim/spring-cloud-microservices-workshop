# Spring Boot / Cloud Workshop Exercise 4

## Goal

* Understand why to use an API Gateway
* Build a Spring Cloud API Gateway using Spring Boot
* Register the Spring Cloud API Gateway at Eureka  
* Expose your "Greeting" Rest API using the API Gateway

## Getting started

* [http://projects.spring.io/spring-cloud/](http://projects.spring.io/spring-cloud/)
* [https://start.spring.io](https://start.spring.io)
* [https://spring.io/guides/gs/routing-and-filtering/](https://spring.io/guides/gs/routing-and-filtering/)
* [http://projects.spring.io/spring-cloud/spring-cloud.html#_router_and_filter_zuul](http://projects.spring.io/spring-cloud/spring-cloud.html#_router_and_filter_zuul)

Hints:

* Create a new Spring Boot application in a separate module

Starter dependencies:

* `spring-cloud-starter-netflix-zuul`
* `spring-cloud-starter-netflix-eureka-server`
* `spring-cloud-starter-netflix-eureka-client`

## Run the applications

First build the project:

```
mvn clean package
```

### Run the executable jar

First start the service registry: 

```
java -jar spring-cloud-service-registry/target/spring-cloud-service-registry-0.0.1-SNAPSHOT.jar
```

Second start the config server:

```
java -jar spring-cloud-config-server/target/spring-cloud-config-server-0.0.1-SNAPSHOT.jar
```

Then run the greeting service:

```
java -jar spring-boot-greeting-service/target/spring-boot-greeting-service-0.0.1-SNAPSHOT.jar
```

Run with a profile:

```
java -jar -Dspring.profiles.active=dutch spring-boot-greeting-service/target/spring-boot-greeting-service-0.0.1-SNAPSHOT.jar
```

### Run using Maven

First start the service registry:

```
cd spring-cloud-service-registry
mvn spring-boot:run
```

Second start the config server:

```
cd spring-cloud-config-server
mvn spring-boot:run
```

With specific Portuguese profile:

```
cd spring-boot-greeting-service
mvn spring-boot:run -Dspring.profiles.active=portuguese
```

## Config server call the REST API to fetch the configuration for 

`http://config-server:8888/{spring.application.name}/{profile}`

* The default configuration: [http://localhost:8888/greeting-service/default](http://localhost:8888/greeting-service/default)
* The Dutch profile: [http://localhost:8888/greeting-service/dutch](http://localhost:8888/greeting-service/dutch)
* The Portuguese profile: [http://localhost:8888/greeting-service/portuguese](http://localhost:8888/greeting-service/portuguese)

## Check your running application

* Greeting Service: [http://localhost:8080/](http://localhost:8080/)
* Config Server: [http://localhost:8888/](http://localhost:8888/)
* Service Registry: [http://localhost:8761/](http://localhost:8761/)

## Actuator endpoints

* Health endpoint: [http://localhost:8080/health](http://localhost:8080/health)
* Info endpoint: [http://localhost:8080/info](http://localhost:8080/info)
* Env endpoint: [http://localhost:8080/env](http://localhost:8080/env)

