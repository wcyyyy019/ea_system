package com.example.ea_system;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.example.ea_system.mapper", "com.example.ea_system.mapper.ex"})
public class EaSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(EaSystemApplication.class, args);
    }

}
