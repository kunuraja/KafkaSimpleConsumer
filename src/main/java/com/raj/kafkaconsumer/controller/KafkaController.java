package com.raj.kafkaconsumer.controller;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class KafkaController {

    ArrayList<String> msgList = new ArrayList<>();


    @GetMapping("/consumerMsg")
    public List<String> getMsgFromTopic() {
        return msgList;
    }


    @KafkaListener(groupId = "raj-consume-1", topics = "raj1", containerFactory = "kafkaListenerContainerFactory")
    public List<String> getMessageFromTopic(String msg) {
        msgList.add(msg);
        return msgList;
    }


}
