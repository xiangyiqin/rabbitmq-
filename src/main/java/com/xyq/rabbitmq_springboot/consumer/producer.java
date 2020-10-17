package com.xyq.rabbitmq_springboot.consumer;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author xyq
 * @描述：
 * @创建时间：2020/10/11 20:58
 */
@Controller

public class producer {
    @Autowired
    private RabbitTemplate rabbitTemplate;
    @RequestMapping("/hello")
    public void test(){
        System.out.println("+++++++++++++++++++++++++++++++++++++++++");
    }
}
