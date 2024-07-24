package com.wikimedia.consumer;

import com.wikimedia.consumer.model.Wikimedia;
import com.wikimedia.consumer.repository.WikimediaRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaConsumerDB {

    @Autowired
    private WikimediaRepository wikimediaRepository;

    @KafkaListener(topics = "wikimedia-recentchange",groupId = "myGroup")
    public void consume(String eventMessage){
        log.info("Message Received -> {}",eventMessage);
        Wikimedia wikimedia=new Wikimedia();
        wikimedia.setData(eventMessage);
        wikimediaRepository.save(wikimedia);
    }
}
