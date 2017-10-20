# Spring Boot Micro services - Spring Cloud Workshop

## Prerequisites

**Knowledge**

Workshop level: Micro Services beginner

This workshop is designed for developers who are familiar with: 

  * Java 
  * Maven
  * Spring Framework
  
but are pretty new to Spring Boot and the Spring Cloud Netflix stack.   
  
**Tooling**

Before you can start we expect you to have an environment up and running:

  * Your favourite IDE
  * Java 8  
  * Maven 3.x

## Goal 

The goal of this workshop is to learn about building Micro Services using Spring Boot 
and Spring Cloud. In this workshop your are going to build a very simple service from scratch
and in each section you add Micro services infrastructure components.

## Sections in this workshop

This workshop is divided into 4 sections.
For every section we provide a two branches:

* One with starting point for you to start the exercise 
* and one branch that will contain the solution.

The solution from the previous exercise will be the starting point for the next exercise.
For every exercise you will find a markdown file that described the exercise in detail.

Happy coding!

### Spring Boot

* Understand Spring Boot core concepts
  * Auto configuration
  * Starter dependencies
  * Actuators
  * Embedded Tomcat
* Build a simple "Greeting" service using Spring Boot
* Build a simple Rest API 
* Use Spring profiles to show a different message

Branches:

* exercise-1-start
* exercise-1-solution

## Spring Cloud Cloud config server

* Understand why to use a config server
* Build a Spring Cloud config server using Spring Boot
* Serve the "Greeting" service configuration using the config server
* Load the configuration for your "Greeting" service from the config server  

Branches:

* exercise-2-start
* exercise-2-solution

## Spring Cloud Service registry (Eureka) 

* Understand why to use a Service registry
* Build a Spring Cloud Service registry using Spring Boot
* Register your "Greeting" service at Eureka
* Resolve the Cloud Cloud config server via Eureka

Branches:

* exercise-3-start
* exercise-3-solution

## Spring Cloud API Gateway (Zuul)

* Understand why to use an API Gateway
* Build a Spring Cloud API Gateway using Spring Boot
* Expose your "Greeting" Rest API using the API Gateway
  
Branches:

* exercise-4-start
* exercise-4-solution         

