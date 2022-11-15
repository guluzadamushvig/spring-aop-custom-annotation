package com.example.springaop.service;

import com.example.springaop.annotation.Logger;
import com.example.springaop.dto.MessageDto;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class GoodMessageService {

    @SneakyThrows
    @Logger
    public MessageDto getMessage(){
        var message =  new MessageDto("Hello Mushvig!");
        return message;
    }
}
