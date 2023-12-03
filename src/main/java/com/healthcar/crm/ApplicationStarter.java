package com.healthcar.crm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * The `ApplicationStarter` class is the entry point for the application.
 * It includes a `main` method to launch the application using Spring Boot's `SpringApplication.run` method.
 *
 * @see org.springframework.boot.SpringApplication
 * @see org.springframework.boot.autoconfigure.SpringBootApplication
 */
@SpringBootApplication
public class ApplicationStarter {
    public static void main(final String[] args) {
        SpringApplication.run(ApplicationStarter.class, args);
    }
}
