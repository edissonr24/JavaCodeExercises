package org.example.JavaChallenges2024.p04_java_topics.java8;

import java.util.List;

public class Maximum {

    public int maximum(List<Integer> list) {
        int max = list.get(0);
        for(int a:list) {
            if (a > max) {
                max = a;
            }
        }
        return max;
    }
}
