package com.practise.springbootkafkatutorial.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    public NewTopic createTopic(){
        return TopicBuilder.name("javaguides").build();
    }

    public NewTopic createTopicJson(){
        return TopicBuilder.name("javaguides_json").build();
    }
}
