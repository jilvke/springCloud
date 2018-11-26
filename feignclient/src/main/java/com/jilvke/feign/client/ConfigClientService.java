package com.jilvke.feign.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "client-1", fallback = ConfigClientServiceFailure.class)
public interface ConfigClientService {
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    String sayHello();
}
