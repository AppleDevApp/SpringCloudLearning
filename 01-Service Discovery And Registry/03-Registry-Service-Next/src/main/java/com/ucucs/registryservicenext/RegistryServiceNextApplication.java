package com.ucucs.registryservicenext;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class RegistryServiceNextApplication {

    public static void main(String[] args) {
        SpringApplication.run(RegistryServiceNextApplication.class, args);
    }
}
