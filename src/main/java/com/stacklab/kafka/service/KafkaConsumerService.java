package com.stacklab.kafka.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class KafkaConsumerService {

    @KafkaListener(topics = "helloworld")
    public void lister(String message) {
        log.info("Received Message: {}", message);
    }
}
