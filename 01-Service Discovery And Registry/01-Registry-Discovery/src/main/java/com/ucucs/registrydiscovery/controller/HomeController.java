package com.ucucs.registrydiscovery.controller;

import com.ucucs.registrydiscovery.api.HelloServiceFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;

@RestController
public class HomeController {

    @Autowired
    private LoadBalancerClient loadBalancer;

    @Autowired
    private HelloServiceFeignClient helloServiceFeignClient;

    @RequestMapping(value = "/")
    public Object home() {
        var serviceInstance = loadBalancer.choose("registry-service");
        if (serviceInstance == null) {
            return null;
        }
        System.out.println("服务地址：" + serviceInstance.getUri());
        System.out.println("服务名称：" + serviceInstance.getServiceId());
        String callServiceResult = new RestTemplate().getForObject(serviceInstance.getUri().toString() + "/", String.class);
        //return Mono.create(sink -> sink.success(callServiceResult));
        var result = new HashMap<>();
        result.put("Ok", callServiceResult);
        return result;
    }

    @RequestMapping("/feign")
    public Object feignCall() {
        return helloServiceFeignClient.home();
    }

}
