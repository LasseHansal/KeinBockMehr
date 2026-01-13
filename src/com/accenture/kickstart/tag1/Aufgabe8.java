package com.accenture.kickstart.tag1;
import java.util.Scanner;

class Calculator2{
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter your first number");
        double a = sc.nextInt();
        System.out.println("enter your second number");
        double b = sc.nextInt();

        System.out.println("Enter the operation you want to do:");
        String op = sc.next();
        switch (op) {
            case "+":
                System.out.println(a + b);
                break;
            case "-":
                System.out.println(a - b);
                break;
            case "*":
                System.out.println(a * b);
                break;
            case "/":
                System.out.println(a / b);
                break;
            default:
                System.out.println(op + " is not a valid operation");
        }
    }
}
