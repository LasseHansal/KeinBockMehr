package com.accenture.kickstart.tag2;

import java.util.Scanner;

public class aufgabe2 {

    void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int randomNum = (int) (Math.random() * 101);
        boolean game_end = false;

        int guess1;
        int guess2;

        while (!game_end) {
            System.out.println("Enter guess 1: ");
            guess1 = sc.nextInt();

            if (guess1 == randomNum) {
                System.out.println("Guess 1 wins");
                game_end = true;
            } else {
                System.out.println("Enter guess 2: ");
                guess2 = sc.nextInt();

                if (guess2 == randomNum) {
                    System.out.println("Guess 2 wins");
                    game_end = true;
                }
            }
        }

        sc.close();
    }
}
