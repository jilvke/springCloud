package com.jilvke.eureka.client;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @ClassName :  Receiver
 * @Description:
 * @Author: JILVKE
 * @CreateDate: 2018/11/23
 * @Version: 1.0
 */
@Component
@RabbitListener(queues = "hello")
public class Receiver {
    @RabbitHandler
    public void process(String msg) {
        System.out.println("Receiver:"+msg);
    }
}
