package com.jilvke.config.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RefreshScope
@RestController
public class ConfigClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigClientApplication.class, args);
    }

   // @Value("${hello}")
    String hello;

    @RequestMapping(value = "/hello")
    public String hello() {
        return hello;
    }

    @Value("${server.port}")
    String port;

    @RequestMapping("/")
    public String home() {
        return "hello world from port :" + port;
    }
}
