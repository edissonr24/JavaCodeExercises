package org.example.JavaChallenges2024.p01_challenges.backup;

/**
 * Given string S consisting of N letters 'a' or 'b'. This should return true if all occurrences of 'a'
 * are before all occurrences of 'b' and return false otherwise.
 * 'b' does not need to occur in S and 'a' does not need to occur in S
 */
public class ALetterAppearBeforeBLetter {

    public boolean checkWord(String word) {

        boolean check = true;
        for (int i = 0; i < word.length()- 1; i++ ) {
            if ('a' == word.charAt(i) && 'b' != word.charAt(i+1)) {
                check = false;
            }
        }
        return check;
    }
}
