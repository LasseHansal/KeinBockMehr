package com.accenture.kickstart.tag3;

import java.util.ArrayList;
import java.util.List;

public class Aufgabe12 {
    public static void main(String[] args) {
        Dice die1 = new Dice(1);
        Dice die2 =  new Dice(2);
        Dice die3 =  new Dice(3);
        Dice die4 =  new Dice(4);
        Dice die5 =  new Dice(5);
        DiceCup diceCup = new DiceCup();
        ArrayList<Dice> diceList = new ArrayList<>(List.of(die1, die2, die3, die4, die5));
        for (int i = 0; i < 5; i++) {
            System.out.println("Wurf " + (i + 1));
            diceCup.rollTheDices(diceList);
            diceCup.displayDice(diceList);
        }
    }
}
