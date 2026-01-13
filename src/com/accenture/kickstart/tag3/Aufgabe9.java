package com.accenture.kickstart.tag3;

public class Aufgabe9 {
    public static void main(String[] args) {
        Dice die = new Dice(1);
        for (int i = 0; i < 5; i++) {
            die.rollTheDice();
            die.displayDice();
        }
    }
}
