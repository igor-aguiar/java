package com.digitalhouse.exercicios.playground.introductionToPoo;

public class Account {
    private String accountNumber;
    private Double balance;
    private Costumer holder;

    public Account(String accountNumber, Double balance, Costumer holder) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.holder = holder;
    }

    public void deposit(Double value){
        balance += value;
        System.out.println("You are making a deposit");
        System.out.printf("Your new balance is R$ %.2f \n", balance);
    }

    public void withdraw(Double value){
        if( value > balance){
            System.out.println("Insufficient funds");
        } else {
            balance-= value;
            System.out.println("You are making a withdraw");
            System.out.printf("Your new balance is R$ %.2f \n", balance);
        }

    }
}
