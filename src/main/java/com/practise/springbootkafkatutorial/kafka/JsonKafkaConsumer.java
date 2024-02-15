package com.practise.springbootkafkatutorial.kafka;

import com.practise.springbootkafkatutorial.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(JsonKafkaConsumer.class);

    @KafkaListener(topics = "javaguides_json", groupId = "myGroup")
    public void consumer(User user){
        LOGGER.info(String.format("JSON message recieved -> %s",user.toString()));
    }
}
