package com.jilvke.config.client;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName :  ConfigController
 * @Description:
 * @Author: JILVKE
 * @CreateDate: 2018/11/23
 * @Version: 1.0
 */
@RestController
@RefreshScope
public class ConfigController {
    private final Logger logger = Logger.getLogger(getClass());
    @Value("${server.port}")
    Long port;
    @Value("${hello}")
    String hello;

    @RequestMapping(value = "hello")
    public String hello() {
        return hello + ":" + port;
    }

    @RequestMapping(value = "/trace-2", method = RequestMethod.GET)
    public String trace() {
        logger.info("===<call trace-2>===");
        return "Trace";
    }
}
