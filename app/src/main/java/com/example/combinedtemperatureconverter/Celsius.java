package com.example.combinedtemperatureconverter;

// Input celsius, convert to fahrenheit
public class Celsius {

    private double temperature = 0;

    public Celsius(double c){
        temperature = c;
    }

    public double convert(){
        return ((temperature * 9/5) + 32);
    }
}
