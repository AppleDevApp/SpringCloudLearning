package com.ucucs.registrydiscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class RegistryDiscoveryApplication {

    public static void main(String[] args) {
        SpringApplication.run(RegistryDiscoveryApplication.class, args);
    }
}
