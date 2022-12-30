package com.example.springboot2mongo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

@EnableMongoAuditing
@SpringBootApplication
public class SpringBoot2MongoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot2MongoApplication.class, args);
    }

}
