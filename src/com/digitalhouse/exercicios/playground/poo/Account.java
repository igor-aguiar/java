package com.digitalhouse.exercicios.playground.poo;

public class Account {
    private String accountNumber;
    private Double balance;
    private Client owner;

    public String deposit(Double value){
        balance += value;
        return ("Your are making a deposit, your balance is " + balance);
    }

    public String withdraw(Double value){
        if (value > balance){
            return "Insufficient funds";
        }
        balance -= value;
        return ("You're making a withdraw, your balance is "+balance);
    }

    public Account(String accountNumber, Double balance, Client owner) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.owner = owner;
    }
}
