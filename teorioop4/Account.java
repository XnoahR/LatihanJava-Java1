/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.teorioop4;

/**
 *
 * @author LENOVO
 */
public class Account {
    private double balance;
    private String OwnerName;
    private static final double cut = 0.50;
    
    public Account() {
        this.OwnerName = "Undefined";
        this.balance = 0;
        //cut = 3;
    }
    
    public void Add(double balance){
        this.balance += balance;
    }
    public double deduct(double deduction){
        return this.balance -= deduction;
    }
    public double divide2(){
        return this.balance = this.balance * cut;
    }

    public double getCurrentBalance() {
        return balance;
    }

    public String getOwnerName() {
        return OwnerName;
    }

    public void setInitialBalance(double balance) {
        this.balance = balance;
    }

    public void setOwnerName(String OwnerName) {
        this.OwnerName = OwnerName;
    }
    
    
    
    
}
