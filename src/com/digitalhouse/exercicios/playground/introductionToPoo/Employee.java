package com.digitalhouse.exercicios.playground.introductionToPoo;

public class Employee extends Costumer {
    protected Double wage;

    public Employee(String name, String lastName) {
        super(name, lastName);
    }

    public Double getWage() {
        return wage;
    }

    public void calcWage(Integer hours, Double hourValue) {
        this.wage = hourValue*hours;
    }

    public void raiseSalary(Double value){
        wage += value;
    }

    public void annualIncrease(){
        wage *= 0.045;
    }
}
