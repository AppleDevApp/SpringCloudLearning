package com.ucucs.registryservicenext.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public Object home() {
        return "{\\\"name\\\":\\\"node 2\\\"}";

    }

}
