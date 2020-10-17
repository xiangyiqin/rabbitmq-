package com.xyq.rabbitmq_springboot.test;

import com.xyq.rabbitmq_springboot.RabbitmqSpringbootApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author xyq
 * @描述：
 * @创建时间：2020/10/11 14:24
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class TestRabbitMq {
    @Autowired
    private RabbitTemplate rabbitTemplate;
    @Test
    public void test1(){
        rabbitTemplate.convertAndSend("hello","helloword");
    }
    //work
    @Test
    public void test2(){
        for(int i=0;i<5;i++){
            rabbitTemplate.convertAndSend("work","work模型");
        }
    }
    //exchange fanout
    @Test
    public void test3(){
        rabbitTemplate.convertAndSend("exchangefanout","","fanout模型");
    }
    //router
    @Test
    public void test4(){
        rabbitTemplate.convertAndSend("router","info","router模型info");
        rabbitTemplate.convertAndSend("router","haha","router模型haha");
    }


}
