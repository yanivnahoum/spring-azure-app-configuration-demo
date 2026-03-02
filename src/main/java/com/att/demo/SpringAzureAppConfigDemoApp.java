package com.att.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan
public class SpringAzureAppConfigDemoApp {
    static void main(String[] args) {
        SpringApplication.run(SpringAzureAppConfigDemoApp.class, args);
    }
}
