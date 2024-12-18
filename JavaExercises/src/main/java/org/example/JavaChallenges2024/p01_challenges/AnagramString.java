package org.example.JavaChallenges2024.p01_challenges;

/** "casa", "sapo" */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class AnagramString {

    public boolean isAnagram(String text1, String text2) {

        text1 = text1.toUpperCase().trim();
        text2 = text2.toUpperCase().trim();

        if (text1.length() != text2.length()) {
            return false;
        }

        char[] arrayText1 = text1.toCharArray();
        char[] arrayText2 = text2.toCharArray();

        Arrays.sort(arrayText1);
        Arrays.sort(arrayText2);

        if (Arrays.equals(arrayText1, arrayText2)) {
            return true;
        }

        return false;
    }






















    /*public boolean isAnagram(String word1, String word2){
        word1 = word1.toUpperCase().trim();
        word2 = word2.toUpperCase().trim();

        if (word1.length() != word2.length()){
            return false;
        }

        char[] myChar1 = word1.toCharArray();
        char[] myChar2 = word2.toCharArray();

        Arrays.sort(myChar1);
        Arrays.sort(myChar2);

        return Arrays.equals(myChar1, myChar2);

    }*/





}
