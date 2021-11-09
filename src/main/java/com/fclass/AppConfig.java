package com.fclass;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan("com.fclass")
public class AppConfig {
//    @Bean
//    public Car getCar(){
//        return new Car();
//    }
//    @Bean
//    @Primary
//    public RaceTyre getTyre(){
//        return new RaceTyre("Annotation brand");
//    }
}
