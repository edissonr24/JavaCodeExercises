package org.example.JavaChallenges2024.p01_challenges;

import java.util.HashSet;
import java.util.Set;

/**
 Palindrome: a word, phrase, or sequence that reads the same backwards as forwards, e.g. madam or nurses run.
 */
public class CodilityExercise {


    public int solution(int[] A) {
        // Implement your solution here
        Set<Integer> uniqValues = new HashSet<>();
        for (int value:A) {
            if (value > 0) {
                uniqValues.add(value);
            }
        }

        // Find the smallest positive integer that is not in the set
        int smallestPositive = 1;
        while (uniqValues.contains(smallestPositive)) {
            smallestPositive++;
        }

        return smallestPositive;

        /*int index = 1;
        for(Integer c: uniqValues) {
            if (c == index) {
                bigInt = ++index;
            } else {
                break;
            }
        }
        return bigInt;*/
    }
}
