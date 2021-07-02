package com.example.combinedtemperatureconverter;

public class Fahrenheit {
    private double temperature = 0;

    public Fahrenheit(double f){
        temperature = f;
    }

    public double convert(){
        return ((temperature - 32) * 5/9);
    }
}
