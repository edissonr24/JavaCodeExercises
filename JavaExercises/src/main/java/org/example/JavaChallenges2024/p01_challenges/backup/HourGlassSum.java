package org.example.JavaChallenges2024.p01_challenges.backup;

import java.util.List;

public class HourGlassSum {

    public int sum(List<List<Integer>> matrix) {
        int maxSum = Integer.MIN_VALUE;
        int sumaActual = 0;
        int rowSize = matrix.get(0).size()-2;

        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < rowSize; j++) {
                sumaActual = matrix.get(i).get(j) + matrix.get(i).get(j+1) + matrix.get(i).get(j+2)
                                                  + matrix.get(i+1).get(j+1)
                           + matrix.get(i+2).get(j) + matrix.get(i+2).get(j+1) + matrix.get(i+2).get(j+2);
                maxSum =sumaActual > maxSum?sumaActual:maxSum;
            }
        }
        return maxSum;
    }
}
