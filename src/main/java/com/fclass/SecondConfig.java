package com.fclass;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("com.fclass")
public class SecondConfig {

    @Bean(initMethod = "init")
    public Car getCar(){
        return new Car();
    }
}
