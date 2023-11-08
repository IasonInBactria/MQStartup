package com.example.mqstartup.controller;


import com.example.mqstartup.service.MessageService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/msgs")
@RequiredArgsConstructor
public class MessageController {
    private final MessageService messageService;

    @GetMapping
    private String doMessage(){
        String id = messageService.doMessage();
        return id;
    }

}
