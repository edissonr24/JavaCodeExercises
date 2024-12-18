package org.example.JavaChallenges2024.p01_challenges.backup;

import java.util.Arrays;

public class AnagramString {

    public boolean isAnagram(String word1, String word2) {

        boolean isAnagram = true;
        char tempArray1[] = word1.toUpperCase().toCharArray();
        char tempArray2[] = word2.toUpperCase().toCharArray();

        Arrays.sort(tempArray1);
        Arrays.sort(tempArray2);

        for (int i=0; i < tempArray1.length-1; i++) {
            if (!String.valueOf(tempArray1[i]).equalsIgnoreCase(String.valueOf(tempArray2[i]))){
                return false;
            }
        }
        return isAnagram;
    }

}
