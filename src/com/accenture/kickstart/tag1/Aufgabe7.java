package com.accenture.kickstart.tag1;

public class Aufgabe7{
    static void main() {
        Calculator c1 = new Calculator(13, 4);

        System.out.println(c1.wholeNumberDivision());
        System.out.println(c1.calculate_Rest());
    }
}

class Calculator{
    private int a;
    private int b;

    public Calculator(int a, int b){
        this.a = a;
        this.b = b;
    }

    public int calculate_Rest(){
        return this.a % this.b;
    }

    public int wholeNumberDivision(){
        return this.a / this.b;
    }
}
