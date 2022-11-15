package com.example.springaop.controller;

import com.example.springaop.dto.MessageDto;
import com.example.springaop.service.BadMessageService;
import com.example.springaop.service.GoodMessageService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/message")
@RequiredArgsConstructor
public class MessageController {

    //private final BadMessageService badMessageService;
    private final GoodMessageService goodMessageService;

    @GetMapping
    public MessageDto getMessage(){
        return goodMessageService.getMessage();
    }
}
