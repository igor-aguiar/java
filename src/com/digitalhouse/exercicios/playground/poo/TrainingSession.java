package com.digitalhouse.exercicios.playground.poo;

public class TrainingSession {
    private Integer expirience = 10;

    public void trainingA(Player player){
        System.out.println(player.getName() + " has started the training with "+ player.getEnergy() + " energy");
        player.run();
        player.makeGoal();
        player.run();
        player.setExpertise(1);
        System.out.println(player.getName() + " has finished the training with "+ player.getEnergy() + " energy");
    }

}
