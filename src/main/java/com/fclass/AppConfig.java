package com.fclass;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.fclass")
@Import({SecondConfig.class, App.class})
public class AppConfig {

}
