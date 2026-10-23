package com.pluralsight;

public class Dice {

    public static void main(String[] args) {


        int two;
        int four;
        int six;
        int seven;
        int randomDice1;
        int randomDice2;


        for (int i = 0; i < 100; i++) {
            randomDice1 = roll();
            randomDice2 = roll();


        }
    }

    public static int roll() {
        int randomNumber = (int) ((Math.random() * (1 - 6 + 1)) + 1);
    }
}
