package com.fclass;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle{
    public Bike(){
        System.out.println("bike object is also created");
    }
    @Override
    public void drive(){
        System.out.println("the Bike is running");
    }
}
