package com.fclass;

import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle{
    @Override
    public void drive(){
        System.out.println("the car is driving");
    }
}
