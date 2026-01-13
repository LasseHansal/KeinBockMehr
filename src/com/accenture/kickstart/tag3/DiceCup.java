package com.accenture.kickstart.tag3;

import java.util.ArrayList;

public class DiceCup {
    public void rollTheDices(ArrayList<Dice> dices) {
        for (Dice d : dices) {
            d.rollTheDice();
        }
    }
    public void displayDice(ArrayList<Dice> dices) {
        for (Dice d : dices) {
            d.displayDice();
        }
    }
}
