package com.accenture.kickstart.tag2;

import java.util.ArrayList;
import java.util.List;

public class aufgabe4 {
    static void main() {
        List<String> names = new ArrayList<>(List.of("Manuel", "Thomas", "Mario"));

        System.out.println(names);

        names.add("Sebastian");
        System.out.println(names);

        names.remove("Thomas");
        System.out.println(names);

    }
}
