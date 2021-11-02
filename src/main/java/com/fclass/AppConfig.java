package com.fclass;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.fclass")
public class AppConfig {
//    @Bean
//    public Car getCar(){
//        return new Car();
//    }
    @Bean
    public Tyre getTyre(){
        return new Tyre("Annotation brand");
    }
}
