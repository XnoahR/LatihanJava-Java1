/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.teorioop4;

/**
 *
 * @author LENOVO
 */
public class TeoriOOP4 {

    public static void main(String[] args) {
        BicycleRegistration bicycle = new BicycleRegistration();
        bicycle.Bcl();

        System.out.println(" ");
        Account Ray = new Account();
        
        Ray.setOwnerName("Ray");
        Ray.setInitialBalance(10000);
        
        System.out.println("Account Name : " + Ray.getOwnerName());
        System.out.println("Current Balance : " + Ray.getCurrentBalance());
        System.out.println(" ");
        
        
        System.out.println("Balance Add 5000");
        Ray.Add(5000);
        System.out.println("Current Balance : " + Ray.getCurrentBalance());
       
        System.out.println("Balance Deduct 5000");
        Ray.deduct(5000);
        System.out.println("Current Balance : " + Ray.getCurrentBalance());

        System.out.println("Balance Divide 2");
        Ray.divide2();
        System.out.println("Current Balance : " + Ray.getCurrentBalance());
        System.out.println(" ");
        
        Temperature Temp = new Temperature();
        Temp.setCelcius(25);
        Temp.setFarenheit(36);
        System.out.println("Current Celcius : " + Temp.getCelcius() + " Degree");
        System.out.println("Current Farenheit : " + Temp.getFarenheit() + " Degree");
        System.out.println("Current Celcius " + Temp.getCelcius() + " To Farenheit : " + Temp.ToFarenheit());
        System.out.println("Current Farenheit " + Temp.getFarenheit() + " To Celcius : " + Temp.ToCelsius());
        
    }
}
