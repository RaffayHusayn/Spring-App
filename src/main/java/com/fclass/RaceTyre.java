package com.fclass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class RaceTyre implements Tyre {
    private String brand;

//    @Autowired
    public RaceTyre(@Value("${my.tyre}") String b){
        this.brand = b;
        System.out.println("Tyre constructor: param constructor called");
    }

   public String getBrand(){
        return brand;
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
