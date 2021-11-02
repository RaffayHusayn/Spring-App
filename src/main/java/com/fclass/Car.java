package com.fclass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle{
    static String staticName = "this is a static name";
    String brand;
    String name;
    int year;
    @Autowired
    Tyre  tyre;


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Tyre getTyre() {
        return tyre;
    }

    public void setTyre(Tyre tyre) {
        this.tyre = tyre;
    }

//    public Car(String brand, String name, int year, Tyre  t){
//        this.brand = brand;
//        this.name = name;
//        this.year = year;
//        this.tyre = t;
//
//        System.out.println("Car constructor is called with -> brand : "+ this.brand + " name : "+ this.name);
//    }
    @Override
    public void drive(){
        System.out.println("the car is driving : " + tyre);
    }
}
