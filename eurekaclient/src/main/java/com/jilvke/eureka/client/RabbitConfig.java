package com.jilvke.eureka.client;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName :  RabbitConfig
 * @Description:
 * @Author: JILVKE
 * @CreateDate: 2018/11/23
 * @Version: 1.0
 */
@Configuration
public class RabbitConfig {
    @Bean
    public Queue helloQueue() {
        return new Queue("hello");
    }
}
