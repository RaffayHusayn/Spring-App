package com.fclass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Tyre {
    private String brand;

//    public Tyre(String b ){
//        this.brand = b;
//        System.out.println("Tyre constructor: param constructor called");
//    }

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

}
