package org.example.JavaChallenges2024.p01_challenges;

//import com.sun.deploy.util.StringUtils;

import java.util.Collections;
import java.util.stream.Stream;

/**
 * Given string S consisting of N letters 'a' or 'b'. This should return true if all occurrences of 'a'
 * are before all occurrences of 'b' and return false otherwise.
 * 'b' does not need to occur in S and 'a' does not need to occur in S
 * "aaab" --> False
 * "abab" --> True
 */
public class ALetterAppearBeforeBLetter {

    public boolean checkWord(String word) {

        char[] myChar = word.toCharArray();
        for(int i = 0; i < myChar.length-2; i++) {
            if (myChar[i] == 'a' && myChar[i+1] != 'b') {
                return false;
            }
        }
        if (myChar[myChar.length-1] == 'a' ) {
            return false;
        }
        return true;

    }
}
