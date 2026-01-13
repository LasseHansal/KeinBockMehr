package com.accenture.kickstart.tag2;

import java.util.Arrays;

public class aufgabe6 {
    static void main() {
        int[] arr = {1,2,3,4,1223,1231,232,434};

        System.out.println(Arrays.stream(arr).max().getAsInt());
    }
}
