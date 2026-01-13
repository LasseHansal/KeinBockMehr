package com.accenture.kickstart.tag2;

import java.util.Scanner;

public class aufgabe11 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.println("Enter a number: ");
        number = sc.nextInt();

        if(isPrime(number)){
            System.out.println("Prime number");
        }else{
            System.out.println("Not Prime number");
        }
    }
    public static boolean isPrime(int n){
        if (n <= 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        if (n % 2 == 0) {
            return false;
        }

        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
