package com.fclass;

public class Car implements Vehicle{
    String name ;
    String model;
    int year;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Car(String model, String name, int year){
        this.model = model;
        this.name = name;
        this.year = year;
        System.out.println("Car is initialized (with params)");

    }
    @Override
    public void drive(){
        System.out.println("the car is driving");
    }
}
