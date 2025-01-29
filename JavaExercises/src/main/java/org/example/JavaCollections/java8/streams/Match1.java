package org.example.SimpleExamples.java8.streams;

import java.util.Arrays;
import java.util.List;

public class Match1 {
    public static void main(String args[]) {
        List<String> data = Arrays.asList("java", "not", "in", "use");

        boolean result = data.stream().anyMatch(s -> s.startsWith("j"));
        System.out.println(result);
    }
}
