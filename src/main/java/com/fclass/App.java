package com.fclass;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        Car civic = (Car) context.getBean("car");
        System.out.println(Car.staticName);
//        civic.getTyre().setBrand("something other");
        System.out.println(civic.getTyre());
    }
}
