package com.accenture.kickstart.tag2;

import java.util.TreeMap;

public class aufgabe1 {
    static void main() {
        Person p1 = new Person(18, "Gutmann", "Till", true);
        Person p2 = new Person(12, "tew", "fsfdsf", false);

        System.out.println(p1.toString());
        System.out.println(p2.toString());
    }
}

class Person{
    private int age;
    private String lastname;
    private String firstname;
    private Boolean gender;

    Person(int age, String lastname, String firstname, Boolean gender) {
        this.age = age;
        this.lastname = lastname;
        this.firstname = firstname;
        this.gender = gender;
    }

    public String toString(){
        if(this.age >= 18){
            if(gender== true){
                return(
                        "Hallo Herr " + this.lastname + "! für Männer ab 18 Jahre"
                );
            }else{
                return(
                        "Hallo Frau " + this.lastname + "! für Frauen ab 18 Jahre"
                );
            }
        }else{
            return("Hallo "+ this.firstname+ " für alle Jugendlichen und Kinder");
        }
    }
}
