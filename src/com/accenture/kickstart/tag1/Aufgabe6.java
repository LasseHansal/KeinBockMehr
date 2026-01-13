package com.accenture.kickstart.tag1;

public class Aufgabe6 {
    static void main() {
        Person p1 = new Person(37, "Daniel", "m");
    }
}

class Person{
    private int age;
    private String name;
    private String gender;

    public Person(int age, String name, String gender){
        this.age = age;
        this.name = name;
        this.gender = gender;
    }
}
