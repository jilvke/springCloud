package com.jilvke.feign.client;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName :  WebController
 * @Description:
 * @Author: JILVKE
 * @CreateDate: 2018/11/07
 * @Version: 1.0
 */
@RestController
public class WebController {
    @Autowired
    ConfigClientService configClientService;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String sayHello() {
        return configClientService.sayHello();
    }

    public String serviceFailure() {
        return "hello world service is not available !";
    }
}
