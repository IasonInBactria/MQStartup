package com.example.mqstartup.service.impl.activemq.listener;


import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Component;

@Component
public class MessageListener {
    @JmsListener(destination = "order_queue")
    @SendTo("order.other.queue.id")
    public String receive(String id){
        System.out.println("已完成短信发送业务,id为" + id);
        return "new:" + id;
    }
}
