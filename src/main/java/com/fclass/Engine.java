package com.fclass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Engine {
    String company;
    String noise;

    public Engine(@Value("annotation company") String company, @Value("annotation noise") String noise){
        this.company = company;
        this.noise = noise;
    }
    public String makeNoise(){
        return "engine make this noise: "+ noise;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "company='" + company + '\'' +
                ", noise='" + noise + '\'' +
                '}';
    }
    public String getNoise(){
        return noise;
    }
}
