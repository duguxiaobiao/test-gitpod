package com.lonely.gitpod;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.lonely.gitpod.dao")
public class TestGitpodApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestGitpodApplication.class, args);
    }

}
