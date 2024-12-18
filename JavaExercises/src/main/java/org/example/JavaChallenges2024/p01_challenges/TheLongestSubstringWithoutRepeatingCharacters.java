package org.example.JavaChallenges2024.p01_challenges;

import java.util.HashSet;
import java.util.Set;

public class TheLongestSubstringWithoutRepeatingCharacters {

    public String getTheLongestSubstring(String value) {

        String longest = String.valueOf(value.charAt(0));
        for (int i=0; i<= value.length()-1;i++) {
            for (int j=i+1; j<= value.length(); j++) {
                String actualSub = value.substring(i,j);
                boolean hasRepeated = hasRepeatedCharacter(actualSub);
                if (!hasRepeated) {
                    longest = actualSub.length()>longest.length()?actualSub:longest;
                }
            }
        }
        return longest;
    }

    private boolean hasRepeatedCharacter(String text) {
        Set<Character> characterSet = new HashSet<>();
        for(char c:text.toCharArray()) {
            characterSet.add(c);
        }
        return characterSet.size()!=text.length();
    }
}
