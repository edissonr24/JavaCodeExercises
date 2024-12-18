package org.example.JavaChallenges2024.p01_challenges.backup;

import java.util.Arrays;
import java.util.OptionalInt;

public class SecondSmallestElementInArray {

    public int getSecondElement(int[] arrayInt) {

        OptionalInt min = Arrays.stream(arrayInt).min();


        int smallest;
        int secondSmallest;
        smallest = secondSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] < secondSmallest) {
                if (arrayInt[i] < smallest) {
                    secondSmallest = smallest;
                    smallest = arrayInt[i];
                } else {
                    secondSmallest = arrayInt[i];
                }
            }
        }
        System.out.println("Min: " + min + " - Smallest: " + smallest + " - Second Smallest: " + secondSmallest);
        return secondSmallest;
    }
}
