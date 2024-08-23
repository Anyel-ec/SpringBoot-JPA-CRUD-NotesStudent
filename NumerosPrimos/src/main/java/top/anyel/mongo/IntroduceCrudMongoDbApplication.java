package top.anyel.mongo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

@EnableMongoAuditing

@SpringBootApplication
public class IntroduceCrudMongoDbApplication {

    public static void main(String[] args) {
        SpringApplication.run(IntroduceCrudMongoDbApplication.class, args);
    }

}
