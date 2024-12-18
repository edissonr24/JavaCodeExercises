package org.example.JavaChallenges2024.p04_java_topics.java8;

public class LinealSearch {

    public int search(Integer n, Integer[] list) {

        int pos = 0;
        for (int i=0; i<list.length; i++) {
            if (n == list[i]) {
                pos = n;
            }
        }
        return pos;

    }

}
