package com.fclass;

import org.springframework.stereotype.Component;


public class Car implements Vehicle{
    static String staticName = "this is a static name";
    String brand;
    String name;
    int year;

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

    public Car(String brand, String name, int year){
        this.brand = brand;
        this.name = name;
        this.year = year;

        System.out.println("usingjkla argument constructor:::: brand : "+ this.brand + " name : "+ this.name);
    }
    @Override
    public void drive(){
        System.out.println("the car is driving");
    }
}
