package org.example.JavaChallenges2024.p01_challenges.backup;

/**
 Given two strings, determine if they share a common substring. A substring may be as small as
 one character.
 Example:
 - These share the common substring:
 "and"
 "art"
 Share "a"
 - These do not share a substring:
 "be"
 "cat"
 */
public class StringsShareCommonSubstring {

    public boolean checkString(String value1, String value2) {

        for (int i = 0; i < value1.length()-1; i++) {
            String commonSubstring = value1.substring(i,i+1);
            if (value2.contains(commonSubstring)) {
                return true;
            }
        }
        return false;

    }

    // Ejemplouno
    // 0123456789
    // i < 10-4 ---- i < 6
    // i = 5 hasta 9 ----- loun
    // i = 6 hasta 10 ----- ouno
    public boolean checkStringWithSize(String value1, String value2, int size) {

        for (int i = 0; i <= value1.length()-size; i++) {
            String commonSubstring = value1.substring(i,i+size);
            System.out.println("Common value iterated: " + commonSubstring);
            if (value2.contains(commonSubstring)) {
                System.out.println("Common value: " + commonSubstring);
                return true;
            }
        }
        return false;

    }
}
