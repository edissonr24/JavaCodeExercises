package org.example.JavaChallenges2024.p01_challenges;

import java.util.HashSet;
import java.util.Set;

public class LargestSubstringWithoutRepetition {
    public String findLargestSubstring(String word) {

        String largestString = "";
        for (int i = 0; i < word.length()-1; i++) {
            for (int j = i+2; j <= word.length(); j++) {

                String subString = word.substring(i, j);
                boolean isRepeated = containsRepeatedCharacters(subString);

                if (!isRepeated) {
                    largestString = subString.length()>largestString.length()?subString:largestString;
                }
                System.out.println(subString);


            }

        }
        return largestString;
    }

    private boolean containsRepeatedCharacters(String word) {

        char[] myCharArray = word.toCharArray();
        Set<Character> myCharacterSet = new HashSet<>();
        for (char c: myCharArray){
            myCharacterSet.add(c);
        }
        return !(myCharacterSet.size() == word.length());
    }

    /*public static void main(String[] args) {
        String word = "exaemple";
        String largestSubstring = findLargestSubstring(word);
        System.out.println("Largest substring without repetitive characters: " + largestSubstring);
    }*/
}
