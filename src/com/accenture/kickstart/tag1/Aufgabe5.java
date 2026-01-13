package com.accenture.kickstart.tag1;

public class Aufgabe5 {
    static void main() {
        long a = 3;
        int b = 4;
        short c = 5;
        byte d = 6;


        a = b + 3 * (d + 1);
        b = c * c;
        //c = b / 3;
        //d = (byte)a + b;
        d = (byte) (a + b);
    }
}
