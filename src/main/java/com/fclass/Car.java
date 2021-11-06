package com.fclass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.sql.SQLOutput;

@Component
public class Car implements Vehicle{
    static String staticName = "this is a static name";
    @Value("setter brand value ")
    String brand;
    @Value("setter tyre name")
    String name;
    @Value("12")
    int year;
//    @Autowired
    Tyre tyre;
    Engine engine;

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

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

    public void setTyre(RaceTyre tyre) {
        this.tyre = tyre;
    }


    public Car(String brand, String name, int year, Tyre  t, Engine e){
        this.brand = brand;
        this.name = name;
        this.year = year;
        this.tyre = t;
        this.engine = e;
        System.out.println("Car constructor is called with -> brand : "+ this.brand + " name : "+ this.name);
        System.out.println(tyre);
        System.out.println(engine);
    }
    @Override
    public void drive(){
        tyre.maxSpeed();
        System.out.println("the car is driving : " + tyre);
        System.out.println("the engine is driving : " + engine);
        System.out.println("||| brand : "+ brand + " ||| name : "+ name + "||| Year : "+ year);
    }
}
