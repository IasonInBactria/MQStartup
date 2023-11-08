package com.example.mqstartup.service.impl.base;

import com.example.mqstartup.service.MessageService;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;


//@Service
@Data
public class MessageServiceImpl implements MessageService {
    private ArrayList<String> msgList = new ArrayList<String>();
    @Override
    public void sendMessage(String id) {
        System.out.println("待发送信息的订单已纳入处理队列中！id为" + id);
        msgList.add(id);
    }

    @Override
    public String doMessage() {
        String id = msgList.remove(0);
        System.out.println("已完成短信发送业务,id为" + id);
        return id;
    }
}
