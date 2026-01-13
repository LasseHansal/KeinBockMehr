package com.accenture.kickstart.tag1;
import java.util.Scanner;

public class Aufgabe12 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a =  sc.nextInt();

        if(a%2==0){
            System.out.println("Number is even");
        }else{
            System.out.println("Number is odd");
        }
    }
}
