package com.accenture.kickstart.tag1;

public class Aufgabe9 {
    static void main() {
        Rounder r1 = new Rounder();
        int number = 49;

        r1.roundUpOrDown(number);
    }
}


class Rounder{
    public void roundUpOrDown(int number) {
        if(number >= 0 && number <= 1000) {
            if(number%100 < 50){
                System.out.println(number + " is a round down");
            }else {
                System.out.println(number+ " is a round up");
            }
        }else{
            System.out.println("Choose a different number too lazy to handle different case");
        }
    }
}