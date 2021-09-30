package com.digitalhouse.exercicios.playground.poo;

public class Exercicio1 {
    public static void main(String[] args){
        Client igor = new Client("Igor", "Aguiar");
        Client lala = new Client("Lala", "Martins");

        Account lalaAccount = new Account("1234", 100.0, lala);
        Account igorAccount = new Account("4321", 200.0, igor);

        System.out.println(lalaAccount.deposit(20.0));
        System.out.println(igorAccount.deposit(30.0));
        System.out.println(lalaAccount.withdraw(50.0));
        System.out.println(igorAccount.withdraw(50.0));
    }
}
