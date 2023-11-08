package com.example.mqstartup.service.impl;

import com.example.mqstartup.service.MessageService;
import com.example.mqstartup.service.OrderService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {
    private final MessageService msgSrv;
    @Override
    public void order(String id) {
        //一系列操作，包括各种服务调用，处理各种设备
        System.out.println("订单处理开始。。。id为" + id);
        //短信消息处理
        msgSrv.sendMessage(id);
        System.out.println("订单处理结束！");
    }
}
