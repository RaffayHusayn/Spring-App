package com.fclass;

public class Engine {
    String company;
    String noise;
    public Engine(String company, String noise){
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
}
