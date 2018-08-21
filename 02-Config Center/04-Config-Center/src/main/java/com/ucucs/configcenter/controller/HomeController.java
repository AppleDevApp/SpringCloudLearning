package com.ucucs.configcenter.controller;

import com.ucucs.configcenter.config.CenterConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class HomeController {

    @Value("${center.type}")
    private String centerType;


    @Value("${center.version}")
    private String centerVersion;

    @Autowired
    private CenterConfig centerConfig;


    @RequestMapping("/")
    public Object home() {
        return "Config Center:" + centerType + "-" + centerVersion;
    }

    @RequestMapping("config")
    public Object config() {
        return "Config Center:" + centerConfig.getType() + "-" + centerConfig.getVersion();
    }

}
