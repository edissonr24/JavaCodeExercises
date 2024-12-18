package org.example.JavaChallenges2024.p01_challenges.backup;

import java.util.HashSet;

public class LargestSubstringWithoutRepetition {
    public static String findLargestSubstring(String word) {
        int maxLength = 0; // Length of the longest substring without repeating characters
        int start = 0; // Start index of the longest substring found so far
        int end = 0; // End index of the longest substring found so far

        HashSet<Character> set = new HashSet<>(); // HashSet to store characters in the current substring

        while (end < word.length()) {
            // If the character at 'end' index is not present in the set, add it to the set
            if (!set.contains(word.charAt(end))) {
                set.add(word.charAt(end));
                end++;
                maxLength = Math.max(maxLength, end - start); // Update maxLength if needed
            } else {
                // If the character at 'end' index is already present in the set, remove characters from 'start' until 'end'
                set.remove(word.charAt(start));
                start++;
            }
        }

        // Extract the substring using 'start' and 'end' indices
        return word.substring(start, start + maxLength);
    }

    public static void main(String[] args) {
        String word = "exaemple";
        String largestSubstring = findLargestSubstring(word);
        System.out.println("Largest substring without repetitive characters: " + largestSubstring);
    }
}
