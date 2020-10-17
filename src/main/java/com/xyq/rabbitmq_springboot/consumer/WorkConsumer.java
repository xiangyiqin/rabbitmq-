package com.xyq.rabbitmq_springboot.consumer;

import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author xyq
 * @描述：
 * @创建时间：2020/10/11 14:53
 */
@Component
public class WorkConsumer {
    @RabbitListener(queuesToDeclare = @Queue("work"))
    public void consumer1(String message){
        System.out.println("consumer1接受++++++++++++++++++"+message);
    }
    @RabbitListener(queuesToDeclare = @Queue("work"))
    public void consumer2(String message){
        System.out.println("consumer2接受------------------"+message);
    }
}
