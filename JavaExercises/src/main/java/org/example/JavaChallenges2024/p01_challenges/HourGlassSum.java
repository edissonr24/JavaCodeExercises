package org.example.JavaChallenges2024.p01_challenges;

import java.util.List;

public class HourGlassSum {

    public int sum(List<List<Integer>> matrix) {

        /*for(List<Integer> innerList:matrix) {
            for(Integer num:innerList){
                System.out.println(num);
            }
        }*/

        int max = Integer.MIN_VALUE;

        for (int i=0; i < matrix.size()-2; i++) {
           for(int j=0; j < matrix.size()-2; j++) {

               int sum = matrix.get(i).get(j) + matrix.get(i).get(j+1) + matrix.get(i).get(j+2)
                       + matrix.get(i+1).get(j+1)
                       + matrix.get(i+2).get(j) + matrix.get(i+2).get(j+1) + matrix.get(i+2).get(j+2);
               System.out.println(sum);
               max = sum > max?sum:max;
           }
        }

        return max;
    }

    public int sumaArray(int[][] myArray) {

        int maxSum = Integer.MIN_VALUE;

        for(int i = 0; i < myArray.length -2; i++) {
            for (int j = i; j < myArray.length -2; j++) {
                int sum = myArray[i][j] + myArray[i][j+1] + myArray[i][j+2]
                                       + myArray[i+1][j+1]
                       + myArray[i+2][j] + myArray[i+2][j+1] + myArray[i+2][j+2];
                maxSum = sum > maxSum?sum:maxSum;

            }
        }

        return maxSum;

    }
}
