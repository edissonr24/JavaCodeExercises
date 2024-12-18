package org.example.JavaChallenges2024.p01_challenges;

import java.util.HashSet;
import java.util.Set;

public class StringUniqueCharacters {
    public boolean hasUniqueCharacters(String input) {

        if (input == null || input.length()==0) {
            return true;
        }
        Set<Character> characterSet = new HashSet<>();
        for(char ch:input.toCharArray()){
            characterSet.add(ch);
        }
        return input.length()==characterSet.size();

    }

}
