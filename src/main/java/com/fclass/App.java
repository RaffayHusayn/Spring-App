package com.fclass;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
//        ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
//
//        Vehicle civic = factory.getBean(Car.class);
//        civic.drive();

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Vehicle civic = context.getBean("car", Vehicle.class);
        System.out.println("\n");
        System.out.println("\n");
        civic.drive();
    }
}
