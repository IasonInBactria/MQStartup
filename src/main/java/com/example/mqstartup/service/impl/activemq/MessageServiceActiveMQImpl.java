package com.example.mqstartup.service.impl.activemq;

import com.example.mqstartup.service.MessageService;
import lombok.RequiredArgsConstructor;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class MessageServiceActiveMQImpl implements MessageService {
    private final JmsMessagingTemplate messagingTemplate;
    @Override
    public void sendMessage(String id) {
        System.out.println("待发送信息的订单已纳入处理队列中！id为" + id);
        //messagingTemplate.convertAndSend(id);
        messagingTemplate.convertAndSend("order_queue", id);
    }

    @Override
    public String doMessage() {
        String id = messagingTemplate.receiveAndConvert("order_queue",String.class);
        System.out.println("已完成短信发送业务,id为" + id);
        return id;
    }
}
