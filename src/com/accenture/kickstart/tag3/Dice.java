package com.accenture.kickstart.tag3;

import java.util.Random;

public class Dice {
    private int id;
    private int value;

    public Dice(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public int getValue() {
        return value;
    }
    public void rollTheDice(){
        value = new Random().nextInt(6) + 1;
    }
    public void displayDice(){
        System.out.print("ID: " + id);
        System.out.println(" Value: " + value);
    }
}
