package com.digitalhouse.exercicios.playground.introductionToPoo;

public class Manager extends Employee{
    private Double[] raises = new Double[10];
    private Integer actualRaise = 0;
    int iterator = 0;


    public Manager(String name, String lastName) {
        super(name, lastName);
    }

    @Override
    public void calcWage(Integer hours, Double hourValue) {
        wage = (hourValue*hours);
        wage *= 1.10;
        registerRaise(wage);

        System.out.println("Actual Salary:" + wage);
    }

    @Override
    public void raiseSalary(Double value) {
        super.raiseSalary(value);
        registerRaise(wage);
    }

    public void registerRaise(Double wage){
        raises[actualRaise] = wage;
        for (Double salary: raises
             ) {
            if(salary == null){
                break;
            }
            System.out.println(++iterator + "º Salary: R$ " + salary);
        }
    }
}
