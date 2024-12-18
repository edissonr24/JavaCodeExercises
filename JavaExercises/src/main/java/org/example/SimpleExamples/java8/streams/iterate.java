package org.example.SimpleExamples.java8.streams;

import java.util.Arrays;
import java.util.List;

public class iterate {
    public static void main(String args[]) {
        List<String> data = Arrays.asList("java", "not", "in", "use");

        data.stream().sorted().filter((s) -> !s.startsWith("n"))
                .map(String::toUpperCase).forEach(System.out::println);

    }
}
