package com.digitalhouse.exercicios.playground.introductionToPoo;

public class Manager extends Employee{
    private Double[] raises = new Double[10];
    private Integer actualRaise = 0;

    public Manager(String name, String lastName) {
        super(name, lastName);
    }

    @Override
    public void calcWage(Integer hours, Double hourValue) {
        wage = (hourValue*hours);
        wage *= 0.1;
        registerRaise(wage);

        System.out.println("Actual Salary:" + wage);
    }

    public void registerRaise(Double wage){
        raises[actualRaise] = wage;
        int iterator = 0;
        for (Double salary: raises
             ) {
            System.out.println(++iterator + "º Salary: R$ " + salary);
        }
    }
}
