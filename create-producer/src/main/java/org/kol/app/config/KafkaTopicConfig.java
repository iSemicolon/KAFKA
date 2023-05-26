package org.kol.app.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic kafkaGuides(){
        return TopicBuilder.name("kafkaguides") //topic name
             //   .partitions(10) for 10 partitions
                .build();
    }
}
