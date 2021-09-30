package com.digitalhouse.exercicios.playground.poo;

public class Player {
    private String name;
    private Integer energy;
    private Integer happiness;
    private Integer goals = 0;
    private Integer expertise;

    public Player(String name, Integer energy, Integer happiness, Integer expertise) {
        this.name = name;
        this.energy = energy;
        this.happiness = happiness;
        this.expertise = expertise;
    }

    public String getName() {
        return name;
    }

    public Integer getEnergy() {
        return energy;
    }

    public void setExpertise(Integer expertise) {
        this.expertise += expertise;
    }

    public String makeGoal(){
        energy -= 5;
        happiness += 10;
        goals++;
        return "GOOOOAALL!!!";
    }

    public String run(){
        energy -= 10;
        return "I'm tired!";
    }


}
