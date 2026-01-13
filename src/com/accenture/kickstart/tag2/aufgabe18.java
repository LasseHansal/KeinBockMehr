package com.accenture.kickstart.tag2;

public class aufgabe18 {

    public static void main(String[] args) {

        int[] arr = {9, 7, 8, 3, 7, 6, 5, 7, 2, 7, 8, 1};

        int sumEven = 0;
        int sumOdd = 0;

        for (int num : arr) {
            if (num % 2 == 0) {
                sumEven += num;
            } else {
                sumOdd += num;
            }
        }

        int lastIsbnNumber = 10 - (sumEven + 3 * sumOdd) % 10;

        System.out.println("Last ISBN-Digit: " + lastIsbnNumber);
    }
}
