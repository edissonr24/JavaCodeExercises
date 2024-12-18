package org.example.JavaChallenges2024.p07_interviews;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SetExercise {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];

        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }

        //Write your code here
        Set<String> dataSet = new HashSet<>();
        for (int i = 0; i < t; i++) {
            dataSet.add((pair_right[i]+pair_left[i]));
            System.out.println(dataSet.size());
        }

    }
}
