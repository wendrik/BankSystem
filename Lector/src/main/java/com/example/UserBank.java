package com.example;

public class UserBank {
    private int userId;
    private String name;
    private double balance;

    public UserBank(int id, String name, Double amount){
        this.userId = id;
        this.name = name;
        this.balance = amount;
    }

    public int getId(){
        return userId;
    }
    public String getName(){
        return name;
    }
    public double getBalance(){
        return balance;
    }

    public boolean withdraw(Double amount) {
        if (amount <= 0) {
            return false;
        }

        if (balance < amount) {
            return false;
        }
        this.balance -= amount;

        return true;
    }
    public boolean deposit(Double amount){
        if (amount <= 0) {
            return false;
        }
        this.balance += amount;
        return true;

    }
}




