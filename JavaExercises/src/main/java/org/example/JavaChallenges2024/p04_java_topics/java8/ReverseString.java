package org.example.JavaChallenges2024.p04_java_topics.java8;

public class ReverseString {

    public String reverse(String s) {

        StringBuilder reversed = new StringBuilder("");
        for (int i = s.length()-1; i >= 0; i--) {
            reversed.append(s.charAt(i));
        }

        return reversed.toString();
    }

}
