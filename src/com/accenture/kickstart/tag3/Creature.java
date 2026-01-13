package com.accenture.kickstart.tag3;

public class Creature {
    private String name;
    private int attackValue;
    private int hitPoints;
    public Creature(String name, int attackValue, int hitPoints) {
        this.name = name;
        this.attackValue = attackValue;
        this.hitPoints = hitPoints;
    }

    public void attackCreature(Creature creature) {
        creature.hitPoints -= this.attackValue;
    }

    public String getName() {
        return name;
    }

    public int getAttackValue() {
        return attackValue;
    }

    public int getHitPoints() {
        return hitPoints;
    }
}
