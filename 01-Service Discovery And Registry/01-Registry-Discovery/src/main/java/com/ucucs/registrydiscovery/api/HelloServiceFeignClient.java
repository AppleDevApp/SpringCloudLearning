package com.ucucs.registrydiscovery.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
@FeignClient("registry-service")
public interface HelloServiceFeignClient {

    @GetMapping("/")
    String home();
}
