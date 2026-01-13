package com.accenture.kickstart.tag3;

import java.util.Locale;
import java.util.Scanner;

public class Aufgabe2 {
    void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        Calculator2 calc = new Calculator2();

        boolean flag = false;

        while(!flag) {
            calc.getEndingCapital(sc);

            System.out.println("Want to calculate another one?: ");
            String answer = sc.next().toLowerCase(Locale.ROOT);

            if(answer.equals("no")){
                flag = true;
            } else if (!answer.equals("yes")) {
                System.out.println(answer + " is an invalid input");
            }
        }
    }
}

class Calculator2 {
    int startingCapital;
    double percentage;
    int numberOfYears;

    public void getEndingCapital(Scanner sc) {
        System.out.print("Starting Capital: ");
        this.startingCapital = sc.nextInt();

        System.out.print("Percentage: ");
        this.percentage = sc.nextDouble();

        System.out.print("Number of years: ");
        this.numberOfYears = sc.nextInt();

        double result = this.startingCapital * Math.pow(1 + this.percentage, this.numberOfYears);

        System.out.printf("Ending capital: %.2f%n", result);
    }
}