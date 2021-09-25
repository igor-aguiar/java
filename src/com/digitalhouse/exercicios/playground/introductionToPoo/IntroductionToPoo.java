package com.digitalhouse.exercicios.playground.introductionToPoo;

public class IntroductionToPoo {

    public static void main(String[] args) {
        Client newClient = new Client("Igor", "Aguiar");
        Account newAccount = new Account("1234", 100.0, newClient);

        newAccount.deposit(100.0);
        newAccount.withdraw(100.0);
        newAccount.withdraw(200.0);
    }
}
