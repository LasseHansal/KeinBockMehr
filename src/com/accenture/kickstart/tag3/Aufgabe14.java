package com.accenture.kickstart.tag3;

public class Aufgabe14 {
    public static void main(String[] args) {
        Creature vampir = new Creature("Vampir", 4, 6);
        Creature zombie = new Creature("Zombie", 2, 10);
        for (int i = 0; i < 2; i++) {
            zombie.attackCreature(vampir);
            vampir.attackCreature(zombie);
            System.out.println("Zombie: " + zombie.getHitPoints() + " Vampir: " + vampir.getHitPoints());
        }
    }
}
