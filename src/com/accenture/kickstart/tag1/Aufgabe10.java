package com.accenture.kickstart.tag1;
import java.util.Scanner;

public class Aufgabe10 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\uD835\uDC66 = \uD835\uDC4E ∗ \uD835\uDC65" +
                "3 + \uD835\uDC4F ∗ \uD835\uDC65" +
                "2 + \uD835\uDC50 ∗ \uD835\uDC65 + \uD835\uDC51");

        System.out.println("Enter x: ");
        int x = sc.nextInt();
        System.out.println("Enter a: ");
        int a = sc.nextInt();
        System.out.println("Enter b: ");
        int b = sc.nextInt();
        System.out.println("Enter c: ");
        int c = sc.nextInt();
        System.out.println("Enter d: ");
        int d = sc.nextInt();

        System.out.println("RESULT: " + (a*x^3+b*x^2+c*x+d));
    }
}
