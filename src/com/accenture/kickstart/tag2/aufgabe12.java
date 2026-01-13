package com.accenture.kickstart.tag2;

import java.util.Arrays;

public class aufgabe12 {
    static void main() {
        int[][][] arr;

        arr = new int[3][3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    arr[i][j][k] = (int) (Math.random() * 11);
                }
            }
        }

        System.out.println(Arrays.deepToString(arr));
    }
}
