package com.greenfoxacademy.bankofsimba.models;

public class BankAccount {
    private String name;
    private double balance;
    private String animalType;
    private boolean king;


    public BankAccount(String name, double balance, String animalType, boolean king) {
        this.name = name;
        this.balance = balance;
        this.animalType = animalType;
        this.king = king;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public String getAnimalType() {
        return animalType;
    }
}