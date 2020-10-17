package com.xyq.rabbitmq_springboot.consumer;

import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author xyq
 * @描述：
 * @创建时间：2020/10/11 15:43
 */
@Component
public class RouterConsumer {
    @RabbitListener(
            bindings = {@QueueBinding(
                    value = @Queue,
                    exchange = @Exchange(value = "router",type = "direct"),
                    key = {"info","haha"}
            )}
    )
    public void routerReceive(String message){
        System.out.println("router接受info，hhaa"+message);
    }

    @RabbitListener(
            bindings = {@QueueBinding(
                    value = @Queue,
                    exchange = @Exchange(value = "router",type = "direct"),
                    key = {"info"}
            )}
    )
    public void routerReceive1(String message){
        System.out.println("router接受info"+message);
    }
}
