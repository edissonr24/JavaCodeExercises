package org.example.JavaChallenges2024.p01_challenges.backup;

/**
 Two strings are anagrams of each other if the letters of one string can be rearranged to form the other string.
 Given a string, find the number of pairs of substrings of the string that are anagrams of each other.
 Examples
 - "mom"
 [m, m] [mo, om]
 - "abba"
 [a,a] [ab,ba] [b,b] [abb, bba]
 */

public class PairsOfSubstringsAreAnagrams {
    public int getNumberOfAnagrams(String stringValue) {

        String reversedString = new StringBuilder(stringValue).reverse().toString();
        int count = 0;
        // iterate the substrings
        for (int iniSub=0; iniSub<stringValue.length()/2; iniSub++) {

            for (int endSub=iniSub+1; endSub<stringValue.length()-iniSub; endSub++) {
                String subAnagram1 = stringValue.substring(iniSub, endSub);
                String subAnagram2 = reversedString.substring(iniSub, endSub);

                if (subAnagram1.equalsIgnoreCase(subAnagram2)) {
                    System.out.println("Anagrama: " + subAnagram1);
                    count++;
                }
            }
        }
        System.out.println("Total: " + count + "\n");
        return count;
    }
}
