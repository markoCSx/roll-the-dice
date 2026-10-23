package com.pluralsight;

public class Dice {

    public static void main(String[] args) {

        int two = 0;
        int four = 0;
        int six = 0;
        int seven = 0;
        int randomDice1;
        int randomDice2;
        int sum;

        for (int i = 1; i <= 100; i++) {
            randomDice1 = roll();
            randomDice2 = roll();
            sum = randomDice1 + randomDice2;
            System.out.printf("Roll %d: %d - %d   Sum: %d\n", i, randomDice1, randomDice2, sum);
            switch (sum) {
                case 2 -> two++;
                case 4 -> four++;
                case 6 -> six++;
                case 7 -> seven++;
            };
        }

        sum = two + four + six + seven;
        System.out.printf("""
                Two: %d
                Four: %d
                Six: %d
                Seven: %d
                Total = %d
                """, two, four, six, seven, sum);

    }

    public static int roll() {
        int randomNumber = (int) ((Math.random() * (6 - 1 + 1)) + 1);
        return randomNumber;
    }

}
