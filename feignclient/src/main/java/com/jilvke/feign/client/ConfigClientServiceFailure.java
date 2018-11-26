package com.jilvke.feign.client;

import org.springframework.stereotype.Component;

/**
 * @ClassName :  ConfigClientServiceFailure
 * @Description:
 * @Author: JILVKE
 * @CreateDate: 2018/11/07
 * @Version: 1.0
 */
@Component
public class ConfigClientServiceFailure implements ConfigClientService {
    @Override
    public String sayHello() {
        return "hello world service is not available --feign";
    }
}
