package com.fclass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.sql.SQLOutput;

@Component
public class Car implements Vehicle{
    static String staticName = "this is a static name";
//    @Value("setter brand value is called ")
    String brand;


    @Value("setter tyre name")
    String name;
//    @Value("12")
    int year;


    @Autowired
    Tyre tyre;

    Engine engine;

    public Engine getEngine() {
        return engine;
    }

    @Autowired
    public void setEngine(Engine engine) {
        this.engine = engine;
        System.out.println("CAR:setter for engine");
    }

    public String getBrand() {
        return brand;
    }

    @Autowired
    public void setBrand(@Value("autowired setter brand")String brand) {
        System.out.println("setter for brand is called \n");
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    @Autowired
    public void setName(@Value("autowired name setter")String name) {
        System.out.println("\n name setter is being called \n");
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
    //@Autowired
    public void setTyre(SnowTyre tyre) {
        this.tyre = tyre;
        System.out.println("CAR:setter for tyre");
    }
    @Autowired
    public Car(@Value("3 cons brand") String brand ,@Value("3 constructor name") String name, @Value("12") int year){
        this.brand = brand;
        this.name = name;
        this.year = year;
        System.out.println("using the 3 argument CAR Constructor");
        System.out.println("3 ARG CONSTRUCTOR > Brand : "+ brand + " > Name : "+ name + " > Year : "+ year + " > Tyre : "+ tyre+ " > Engine : "+ engine);
    }

//
//    public Car(String brand, String name, int year, Tyre  t, Engine e){
//        this.brand = brand;
//        this.name = name;
//        this.year = year;
//        this.tyre = t;
//        this.engine = e;
//        System.out.println("5 argument constructor is called");
//        System.out.println(tyre);
//        System.out.println(engine);
//    }
//   @Autowired
   public Car(@Value("constructor brand")String b,@Value("Cosntr name") String n, @Value("12") int y, Tyre t){
        this.brand = b;
        this.name = n;
        this.year = y;
        this.tyre = t;
       System.out.println("4 argument constructor is called");
   }

    @Override
    public void drive(){
        tyre.maxSpeed();
        System.out.println("the car is driving : " + tyre);
        System.out.println("the engine is driving : " + engine);
        System.out.println("||| brand : "+ brand + " ||| name : "+ name + "||| Year : "+ year);
    }
}
