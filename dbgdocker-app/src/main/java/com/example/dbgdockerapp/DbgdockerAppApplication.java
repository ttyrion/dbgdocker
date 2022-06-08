package com.example.dbgdockerapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.example"})
public class DbgdockerAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(DbgdockerAppApplication.class, args);
    }

}
