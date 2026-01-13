package com.accenture.kickstart.tag2;
import java.util.Scanner;
import java.util.Random;

public class aufgabe15 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        int randNumber =  new Random().nextInt(10);
        int guess;
        boolean gameOver = false;

        while (!gameOver) {
            System.out.println("Enter guess: ");
            guess = sc.nextInt();

            if(guess<randNumber){
                System.out.println("Wrong guess number is higher");
            }else if(guess>randNumber){
                System.out.println("Wrong guess number is lower");
            }else{
                System.out.println("You guessed correctly");
                gameOver = true;
            }
        }
    }
}
