package com.xyq.rabbitmq_springboot.consumer;

import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author xyq
 * @描述：
 * @创建时间：2020/10/11 14:30
 */
@Component
@RabbitListener(queuesToDeclare = @Queue("hello"))
public class HelloConsumer {
    @RabbitHandler
    public void receive(String message){
        System.out.println("消息"+message);
    }
}
