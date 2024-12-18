package org.example.JavaChallenges2024.p01_challenges;

import java.util.*;

/**
 * that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.
 *
 * For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.
 *
 * Given A = [1, 2, 3], the function should return 4.
 *
 * Given A = [−1, −3], the function should return 1.
 *
 * Write an efficient algorithm for the following assumptions:
 *
 * N is an integer within the range [1..100,000];
 * each element of array A is an integer within the range [−1,000,000..1,000,000].
 */
public class SmallestPositiveIntDoesNotOccurInArray {

    public int getSmallestPositive(int[] arrayInt) {

        Arrays.sort(arrayInt);
        System.out.println(Arrays.toString(arrayInt));

        Set<Integer> positiveSet = new HashSet<>();
        for (int i = 0; i < arrayInt.length; i++) {
            positiveSet.add(arrayInt[i]);
        }

        int c = 1;
        while (positiveSet.contains(c)) {
            c++;
        }

        return c;
    }
}
