package com.fclass;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.fclass")
@Import({SecondConfig.class})
public class AppConfig {
//    @Bean
//    @Primary
//    public RaceTyre getTyre(){
//        return new RaceTyre("Annotation brand");
//    }
}
