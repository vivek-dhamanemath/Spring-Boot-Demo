# SpringBoot_Demo

This is a demo project for Spring Boot.

## Description

This project demonstrates the basic setup and usage of a Spring Boot application. It includes dependencies for building web applications, connecting to a MySQL database, and testing.

**Dependencies:**

![Spring Boot Initializer](https://github.com/user-attachments/assets/b1ed1f78-e520-465d-90c0-1afa66f9f352)


## Spring Boot

Spring Boot is an extension of the Spring framework that simplifies the setup and development of new Spring applications. It provides a range of features that make it easy to create stand-alone, production-grade Spring-based applications.

### Features

- **Auto-Configuration**: Automatically configures your Spring application based on the dependencies you have added.
- **Standalone**: Creates stand-alone Spring applications that can be run with a simple `java -jar` command.
- **Production-Ready**: Includes embedded servers like Tomcat, Jetty, and Undertow, making it easy to deploy applications.
- **Opinionated Defaults**: Provides a set of default configurations to get you started quickly.
- **Spring Boot CLI**: Allows you to quickly prototype with Spring.

## Spring Boot Tutorial

Spring Boot Tutorial provides basic and advanced concepts of Spring Framework. Our Spring Boot Tutorial is designed for beginners and professionals both.

Spring Boot is a Spring module that provides the RAD (Rapid Application Development) feature to the Spring framework.

Our Spring Boot Tutorial includes all topics of Spring Boot, such as features, project, maven project, starter project wizard, Spring Initializr, CLI, applications, annotations, dependency management, properties, starters, Actuator, JPA, JDBC, etc.

### What is Spring Boot

Spring Boot is a project that is built on the top of the Spring Framework. It provides an easier and faster way to set up, configure, and run both simple and web-based applications.

It is a Spring module that provides the RAD (Rapid Application Development) feature to the Spring Framework. It is used to create a stand-alone Spring-based application that you can just run because it needs minimal Spring configuration.

In short, Spring Boot is the combination of Spring Framework and Embedded Servers.

In Spring Boot, there is no requirement for XML configuration (deployment descriptor). It uses convention over configuration software design paradigm that means it decreases the effort of the developer.

We can use Spring STS IDE or Spring Initializr to develop Spring Boot Java applications.

### Why should we use Spring Boot Framework?

We should use Spring Boot Framework because:

- The dependency injection approach is used in Spring Boot.
- It contains powerful database transaction management capabilities.
- It simplifies integration with other Java frameworks like JPA/Hibernate ORM, Struts, etc.
- It reduces the cost and development time of the application.

Along with the Spring Boot Framework, many other Spring sister projects help to build applications addressing modern business needs. There are the following Spring sister projects:

- **Spring Data**: It simplifies data access from the relational and NoSQL databases.
- **Spring Batch**: It provides powerful batch processing.
- **Spring Security**: It is a security framework that provides robust security to applications.
- **Spring Social**: It supports integration with social networking like LinkedIn.
- **Spring Integration**: It is an implementation of Enterprise Integration Patterns. It facilitates integration with other enterprise applications using lightweight messaging and declarative adapters.

### Advantages of Spring Boot

- It creates stand-alone Spring applications that can be started using `java -jar`.
- It tests web applications easily with the help of different Embedded HTTP servers such as Tomcat, Jetty, etc. We don't need to deploy WAR files.
- It provides opinionated 'starter' POMs to simplify our Maven configuration.
- It provides production-ready features such as metrics, health checks, and externalized configuration.
- There is no requirement for XML configuration.
- It offers a CLI tool for developing and testing the Spring Boot application.
- It offers a number of plug-ins.
- It also minimizes writing multiple boilerplate codes (the code that has to be included in many places with little or no alteration), XML configuration, and annotations.
- It increases productivity and reduces development time.

### Limitations of Spring Boot

Spring Boot can use dependencies that are not going to be used in the application. These dependencies increase the size of the application.

### Goals of Spring Boot

The main goal of Spring Boot is to reduce development, unit test, and integration test time.

- Provides Opinionated Development approach
- Avoids defining more Annotation Configuration
- Avoids writing lots of import statements
- Avoids XML Configuration

By providing or avoiding the above points, Spring Boot Framework reduces Development time, Developer Effort, and increases productivity.

### Prerequisite of Spring Boot

To create a Spring Boot application, following are the prerequisites. In this tutorial, we will use Spring Tool Suite (STS) IDE.

- Java 1.8
- Maven 3.0+
- Spring Framework 5.0.0.BUILD-SNAPSHOT
- An IDE (Spring Tool Suite) is recommended.

### Spring Boot Features

- Web Development
- SpringApplication
- Application events and listeners
- Admin features
- Externalized Configuration
- Properties Files
- YAML Support
- Type-safe Configuration
- Logging
- Security

## Dependencies

- **Spring Boot Starter Web**: Used for building web applications, including RESTful services.
- **Spring Boot DevTools**: Provides development-time features such as automatic restarts and configurations.
- **MySQL Connector**: Used for connecting to MySQL databases.
- **Spring Boot Starter Test**: Provides testing support for Spring Boot applications.

## Project Structure

The project follows the standard Maven project structure:

```
SpringBoot_Demo/
├── src/
│   ├── main/
│   │   ├── java/
│   │   └── resources/
│   └── test/
│       ├── java/
│       └── resources/
├── pom.xml
└── README.md
```

## Getting Started

1. **Clone the repository**:
    ```sh
    git clone <repository-url>
    cd SpringBoot_Demo
    ```

2. **Build the project**:
    ```sh
    mvn clean install
    ```

3. **Run the application**:
    ```sh
    mvn spring-boot:run
    ```

**Output:**

![output](https://github.com/user-attachments/assets/f32842be-e147-4913-b9d2-bdd89b729c85)


## License

This project is licensed under the MIT License.
