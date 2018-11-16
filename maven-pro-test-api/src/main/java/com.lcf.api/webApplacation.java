package com.lcf.api;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.lcf"})
public class webApplacation {

    public static void main(String[] args) {
        SpringApplication.run(webApplacation.class, args);
    }
}