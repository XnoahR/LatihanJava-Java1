/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.teorioop4;

/**
 *
 * @author LENOVO
 */
public class Temperature {
    private double Celcius;
    private double Farenheit;

    public Temperature(){
        this.Celcius = 0;
        this.Farenheit = 32;
    }

    public void setCelcius(double Celcius) {
        this.Celcius = Celcius;
    }

    public void setFarenheit(double Farenheit) {
        this.Farenheit = Farenheit;
    }
    
    public double ToCelsius(){
        double Tcelcius = (this.Farenheit - 32)*5/9;
        return Tcelcius;
    }
    public double ToFarenheit(){
        double TFarenheit = (this.Celcius * 9/5) + 32;
        return TFarenheit;
    }

    public double getCelcius() {
        return this.Celcius;
    }

    public double getFarenheit() {
        return this.Farenheit;
    }
    
    
}
