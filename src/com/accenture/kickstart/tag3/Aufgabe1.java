package com.accenture.kickstart.tag3;
import java.util.Locale;
import java.util.Scanner;

public class Aufgabe1 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();

        String answer;
        boolean flag = false;

        while(!flag) {
            calc.getAnnualInterestRate();

            System.out.println("Want to calculate another one: ");
            answer = sc.next();


            if(answer.toLowerCase(Locale.ROOT).equals("no")){
                flag =  true;
            } else if (answer.toLowerCase(Locale.ROOT).equals("yes")) {
                continue;
            }else {
                System.out.println(answer + " invalid input");
            }
        }
    }
}

class Calculator{
    int startingCapital;
    double percentage;

    public void getAnnualInterestRate() {
        Scanner sc = new Scanner(System.in);

        System.out.println("starting Capital: ");
        this.startingCapital = sc.nextInt();
        System.out.println("percentage: ");
        this.percentage = sc.nextDouble();
        System.out.println("annual interest rate: ");
        System.out.println(this.startingCapital * this.percentage);
    }
}