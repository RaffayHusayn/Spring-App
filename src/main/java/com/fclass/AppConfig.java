package com.fclass;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.fclass")
@PropertySource("classpath: application.properties") // this is required for @Value("${properties value}")
@Import({SecondConfig.class, App.class})
public class AppConfig {

}
