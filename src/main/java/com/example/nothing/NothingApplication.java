package com.example.nothing;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author dream
 */
@SpringBootApplication
@MapperScan("com.example.nothing.*")
@ComponentScan({"com.example.nothing.*","mapper.*"})
public class NothingApplication {

    public static void main(String[] args) {
        SpringApplication.run(NothingApplication.class, args);
    }

}
