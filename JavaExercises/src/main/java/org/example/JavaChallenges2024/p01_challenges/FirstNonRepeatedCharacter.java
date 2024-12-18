package org.example.JavaChallenges2024.p01_challenges;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedCharacter {

    public char getFirstNonRepeatedCharacter(String word) {

        Map<Character, Integer> countingMap = new LinkedHashMap<>();

        char[] arrayChar = word.toCharArray();

        for (Character c:arrayChar) {
            int value = countingMap.getOrDefault(c, 0);
            countingMap.put(c, ++value);
        }

        System.out.println(countingMap.toString());

        for (char key:countingMap.keySet()) {
            System.out.println(key + " - " + countingMap.get(key) );
            if (countingMap.get(key) == 1)
                return key;
        }
        //char first = countingMap.get()

        return 'b';

    }


}
