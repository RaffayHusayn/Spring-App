package com.fclass;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class SecondConfig {

//    @Autowired
//    Tyre tyre;
//    Engine engine;

    @Bean(initMethod = "drive")
    @Primary
//    @Autowired
    public Car getCar(/* Engine engine, Tyre tyre*/){
        Car car =  new Car("constructor", "constructor", 2019);
//        car.setEngine(engine);
//        car.setTyre(tyre);
        return car;
    }
//    @Bean
//    @Primary
//    public RaceTyre getTyre(){
//        return new RaceTyre("Annotation brand");
//    }
}
