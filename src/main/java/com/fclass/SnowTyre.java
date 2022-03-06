package com.fclass;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Component
//@Primary
public class SnowTyre implements Tyre{
    String brand ;
    public SnowTyre(@Value("raffay tyre")String b){
        this.brand = b ;
    }

    public void setBrand(String b){
        this.brand = b;
    }

    public String getBrand(){
        return brand;
    }

   public String toString(){
        return "The brand is : "+ brand;
   }
    @Override
    public void maxSpeed() {
        System.out.println("max speed : 100 mph");
    }
}
