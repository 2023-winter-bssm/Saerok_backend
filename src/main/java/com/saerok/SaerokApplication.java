package com.saerok;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class SaerokApplication {

    public static void main(String[] args) {
        SpringApplication.run(SaerokApplication.class, args);
    }

}
