package com.jilvke.ribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName :  HelloService
 * @Description:
 * @Author: JILVKE
 * @CreateDate: 2018/11/07
 * @Version: 1.0
 */
@RestController
public class HelloService {
    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/")
    @HystrixCommand(fallbackMethod = "serviceFailure")
    public String getHelloContent() {
        return restTemplate.getForObject("http://client-1/hello", String.class);
    }

    public String serviceFailure() {
        return "hello world service is not available -- ribbon";
    }
}
