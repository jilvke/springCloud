package com.jilvke.feign.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "config-client", fallback = ConfigClientServiceFailure.class)
public interface ConfigClientService {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    String sayHello();
}
