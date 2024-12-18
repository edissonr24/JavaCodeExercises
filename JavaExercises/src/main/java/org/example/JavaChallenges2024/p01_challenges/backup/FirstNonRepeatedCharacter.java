package org.example.JavaChallenges2024.p01_challenges.backup;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class FirstNonRepeatedCharacter {

    public char getFirstNonRepeatedCharacter(String value1) {

        char firstNotRepeated = 0;
        char charArray[] = value1.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            firstNotRepeated = charArray[i];
            String actual = value1.substring(i+1, value1.length());
            if(!charExists(actual, firstNotRepeated)) {
                break;
            }
        }
        return firstNotRepeated;

    }

    private boolean charExists(String text, char c) {

        if (text.toUpperCase().contains(String.valueOf(c).toUpperCase())) {
            return true;
        }
        return false;
    }

    public char getFirstNonRepeatedCharacter2(String value1) {

        HashMap<Character, Integer> ocurrences = new HashMap<>();
        for (int i = 0; i < value1.length(); i++) {
            char c = value1.charAt(i);
            if (ocurrences.containsKey(c)) {
                ocurrences.put(c, ocurrences.get(c)+1);
            } else {
                ocurrences.put(c, 1);
            }
        }
        for(Character c: ocurrences.keySet()) {
            System.out.println("Key: " + c + " - Value: " + ocurrences.get(c));
        }

        for (int j = 0; j < value1.length(); j++) {
            char c = value1.charAt(j);
            System.out.println("Value: " + c);
            if (ocurrences.get(c) == 1) {
                return c;
            }
        }

        return '_';

    }


    public char getFirstNonRepeatedCharacter3(String value1) {

        HashMap<Character, Integer> occurrences = new LinkedHashMap<>();
        for (int i = 0; i < value1.length(); i++) {
            char c = value1.charAt(i);
            if (occurrences.containsKey(c)) {
                occurrences.put(c, occurrences.get(c)+1);
            } else {
                occurrences.put(c, 1);
            }
        }
        for(Character c: occurrences.keySet()) {
            System.out.println("Key: " + c + " - Value: " + occurrences.get(c));
            if (occurrences.get(c) == 1) {
                System.out.println("First not repeated value: " + c);
                return c;
            }
        }
        return '_';
    }

    public char getFirstNonRepeatedCharacter4(String s) {

        for (int i = 0; i < s.length(); i++) {
            if (s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i))) {
                return s.charAt(i);
            }
        }
        return '_';
    }
}
