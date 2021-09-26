package com.digitalhouse.exercicios.playground.introductionToPoo;

public class IntroductionToPoo {

    public static void main(String[] args) {
        Costumer newCostumer = new Costumer("Igor", "Aguiar");
        Account newAccount = new Account("1234", 100.0, newCostumer);

        newAccount.deposit(100.0);
        newAccount.withdraw(100.0);
        newAccount.withdraw(200.0);

        Employee employee = new Employee("Igor", "Aguiar");
        employee.calcWage(10, 8.0);
        System.out.println(employee.getWage());
        employee.raiseSalary(20.0);
        System.out.println(employee.getWage());
        Manager manager = new Manager("Lala", "Sousa");
        manager.calcWage(10, 8.0);
        manager.raiseSalary(20.0);
    }
}
