package com.accenture.kickstart.tag2;
import java.util.Scanner;

public class aufgabe13 {
    static void main() {
        Scanner  sc = new Scanner(System.in);

        String testString = "Hallo Welt!";
        int counter = 0;
        char letter;
        double percentage;

        System.out.println("Enter a letter for " + testString);
        letter = sc.next().charAt(0);

        for  (int i = 0; i < testString.length(); i++) {
            if(testString.charAt(i) == letter) {
                counter++;
            }
        }
        percentage = (double)counter/(double)testString.length();

        System.out.println("The word contains " + letter + " " + counter);
        System.out.println("Percentage: " + percentage);
    }
}
