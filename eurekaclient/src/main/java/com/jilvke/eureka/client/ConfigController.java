package com.jilvke.eureka.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.*;

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

    @Value("${server.port}")
    Long port ;

    @Value("${hello}")
    String hello;

    @RequestMapping(value = "hello")
    public String hello() {
        return  hello + ":" + port;
    }
}
