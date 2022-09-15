/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.teorioop4;

/**
 *
 * @author LENOVO
 */
public class BicycleRegistration {
    public void Bcl(){
        Bicycle bike1,bike2;
        bike1 = new Bicycle("Ray");
        bike2 = new Bicycle("Rex",5);
        
        //bike1.setOwnerName("ray");
        //bike2.setOwnerName("rex");
        
        System.out.println("bike 1 owner : " + bike1.getOwnerName());
        System.out.println("bike 2 owner : " + bike2.getOwnerName());
    }
}
