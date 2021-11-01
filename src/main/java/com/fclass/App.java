package com.fclass;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//       Car civic = (Car) context.getBean("car");
        System.out.println(Car.staticName);
//        System.out.println(civic.getName());

    }
}
