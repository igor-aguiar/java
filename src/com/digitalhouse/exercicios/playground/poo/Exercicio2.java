package com.digitalhouse.exercicios.playground.poo;

public class Exercicio2 {
    public static void main(String[] args){
        Player player1 = new Player("Igor", 100, 0, 0);
        Player player2 = new Player("Lala", 100, 0, 0);

        TrainingSession training = new TrainingSession();
        training.trainingA(player1);
        training.trainingA(player2);
    }
}
