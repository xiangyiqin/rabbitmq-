package com.xyq.rabbitmq_springboot.consumer;

import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author xyq
 * @描述：
 * @创建时间：2020/10/11 15:32
 */
@Component
public class FanoutConsumer {
    @RabbitListener(bindings = {
            @QueueBinding(exchange = @Exchange(value = "exchangefanout",type = "fanout"),
                    value = @Queue
            )
    })
    public void fanoutReceive1(String message){
        System.out.println("fanout接受1++++++++++++++"+message);
    }

    @RabbitListener(bindings = {
            @QueueBinding(exchange = @Exchange(value = "exchangefanout",type = "fanout"),
                    value = @Queue
            )
    })
    public void fanoutReceive2(String message){
        System.out.println("fanout接受2--------------"+message);
    }
}
