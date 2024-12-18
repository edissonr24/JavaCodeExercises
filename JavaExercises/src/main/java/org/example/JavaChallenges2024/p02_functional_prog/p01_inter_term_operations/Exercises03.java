package org.example.JavaChallenges2024.p02_functional_prog.p01_inter_term_operations;

import java.util.HashMap;
import java.util.Map;

public class Exercises03 {
    public static void main(String[] args) {
        //int[] teamSize = {1, 2, 2, 3, 4};
        int[] teamSize = {1, 7, 3, 8};
        int k = 1;
        int result = maxUniformTeams(teamSize, k);
        System.out.println("El número máximo de equipos de igual tamaño que pueden ser formados es: " + result);
    }

    public static int maxUniformTeams(int[] teamSize, int k) {
        Map<Integer, Integer> sizeCountMap = new HashMap<>();
        for (int size : teamSize) {
            sizeCountMap.put(size, sizeCountMap.getOrDefault(size, 0) + 1);
        }
        int maxTeams = 0;

        for (Map.Entry<Integer, Integer> entry : sizeCountMap.entrySet()) {
            int actualSize = entry.getKey();
            int actualCount = entry.getValue();

            Map<Integer, Integer> tempSizeCountMap = new HashMap<>(sizeCountMap);
            System.out.println("Size map: " + tempSizeCountMap);
            int tempK = k;

            // Reduce sizes for actual size
            for (Map.Entry<Integer, Integer> tempEntry : tempSizeCountMap.entrySet()) {
                int otherSize = tempEntry.getKey();
                if (otherSize != actualSize && tempK > 0) {
                    int redCount = tempEntry.getValue();
                    int redAmount = Math.min(redCount, tempK);
                    System.out.println("reducibleCount: " + redCount);
                    System.out.println("reduceAmount: " + redAmount);
                    actualCount += redAmount;
                    tempK -= redAmount;
                }
            }

            maxTeams = Math.max(maxTeams, actualCount);
        }
        return maxTeams;
    }
}

