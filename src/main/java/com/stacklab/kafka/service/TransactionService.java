package com.stacklab.kafka.service;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

@Service
public class TransactionService {

    private final KafkaProducerService kafkaProducerService;

    public TransactionService(KafkaProducerService kafkaProducerService) {
        this.kafkaProducerService = kafkaProducerService;
    }

    @PostConstruct
    public void doSomething() {
        for (int i = 0; i < 10; i++) {
            kafkaProducerService.sendMessage("helloworld", String.valueOf(i));
        }
    }
}
