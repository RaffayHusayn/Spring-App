package com.fclass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public

class Tyre {
    private String brand;
    @Autowired
    public Tyre(String b ){
        this.brand = b;
        System.out.println("Tyre constructor: param constructor called");
    }

   public String getBrand(){
        return "the brand is : " + this.brand;
   }

    @Override
    public String toString() {
        return "Tyre{" +
                "brand='" + brand + '\'' +
                '}';
    }

    public void setBrand(String b){
        this.brand = b;
        System.out.println("Tyre Setter is called");
   }

}
