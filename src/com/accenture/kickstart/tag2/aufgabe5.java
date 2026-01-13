package com.accenture.kickstart.tag2;
import java.util.List;
import java.util.ArrayList;

public class aufgabe5 {
    static void main() {
        List<String> letters = new ArrayList<>(List.of("a", "b", "c", "d", "e"));
        System.out.println(letters);

        letters.remove(3);

        System.out.println(letters);
    }
}
