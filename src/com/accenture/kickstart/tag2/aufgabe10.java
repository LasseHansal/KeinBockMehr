package com.accenture.kickstart.tag2;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class aufgabe10 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> arr = new ArrayList<>(List.of("Manuel", "Sebastian", "Thomas", "Mario"));

        System.out.println("Enter what the list should contain: ");
        String s = sc.nextLine();

        if(arr.contains(s)){
            System.out.println("The list contains the given element " + s);
        }else{
            System.out.println("The list does not contain the given element " + s);
        }
    }
}
