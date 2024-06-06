package com.alibou.wikimedia.consumer.consumer;

import com.alibou.wikimedia.consumer.payload.Energie;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import static java.lang.String.format;

@Service
@Slf4j
public class WikimediaConsumer {

    @KafkaListener(topics = "wikimedia-stream", groupId = "myGroup")
    public void consumeMsg(Energie msg) {
        log.info(format("Consuming the message from wikimedia-stream Topic:: %s", msg));
        // Please feel free to do anything you want with the data
    }
}
