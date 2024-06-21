package com.microservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableFeignClients
public class ArchitectureHexagonalStarterApplication {
    public static void main(String[] args) {
        SpringApplication.run(ArchitectureHexagonalStarterApplication.class, args);
    }
}