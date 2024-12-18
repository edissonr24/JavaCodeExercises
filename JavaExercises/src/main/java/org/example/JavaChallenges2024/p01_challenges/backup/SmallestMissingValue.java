package org.example.JavaChallenges2024.p01_challenges.backup;

/**
 Find the smallest missing number in a sorted array
 Input: [0, 1, 2, 6, 9]
 Output: 3
 Input: [4, 5, 10, 11]
 Output: 0
 Input: [0, 1, 2, 3]
 Output: 4
 Input: [0, 1, 2, 3, 4, 5, 6, 7, 10]
 Output: 8
 **/
public class SmallestMissingValue {

    public int getSmallestMissingValue(int[] arrayInt) {

        int smallesMissing = arrayInt.length;
        for (int i = 0; i < arrayInt.length; i++ ) {
            if (i != arrayInt[i]) {
                smallesMissing = i;
                break;
            }
        }
        return smallesMissing;
    }
}
