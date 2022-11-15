package com.example.springaop.service;

import com.example.springaop.dto.MessageDto;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
@Slf4j
public class BadMessageService {
    @SneakyThrows
    public MessageDto getMessage(){
        long startDate = System.currentTimeMillis();
        Thread.sleep(new Random().nextInt(1000));
        var message =  new MessageDto("Hello Mushvig!");
        long endDate = System.currentTimeMillis();
        log.info("Elapsed Time : <---> {}",endDate - startDate);
        log.info("Service getMessage Ended");
        return message;
    }
}
