package com.wikimedia.wiki_kafka;

import com.wikimedia.wiki_kafka.producer.WikiMediaChangesProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootProducer implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootProducer.class, args);
    }

    @Autowired
    private WikiMediaChangesProducer wikiMediaChangesProducer;

    @Override
    public void run(String... args) throws Exception {
        wikiMediaChangesProducer.publishWikiChange();
    }
}
