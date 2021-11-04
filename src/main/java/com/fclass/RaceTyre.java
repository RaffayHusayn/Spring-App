package com.fclass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


public class RaceTyre implements Tyre {
    private String brand;

    public RaceTyre(String b ){
        this.brand = b;
        System.out.println("Tyre constructor: param constructor called");
    }

   public String getBrand(){
        return "the brand is : " + this.brand;
   }

    @Override
    public String toString() {
        return "Tyre is loaded .... brand =  "+ brand;
    }

    public void setBrand(String b){
        this.brand = b;
        System.out.println("Tyre Setter is called");
   }

    @Override
    public void maxSpeed() {
        System.out.println("max speed : 300 mph");
    }
}
