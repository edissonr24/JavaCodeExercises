package org.example.JavaChallenges2024.p04_java_topics.java8;

import java.util.List;

public class Average {

    public Double average(List<Integer> list) {
        return list.stream().mapToInt(i->i).average().getAsDouble();
    }
}
