package com.resto_review;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.resto_review.mapper")
@SpringBootApplication
public class RestoReviewApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestoReviewApplication.class, args);
    }

}
