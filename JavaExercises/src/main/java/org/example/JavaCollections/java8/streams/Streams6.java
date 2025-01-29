package org.example.SimpleExamples.java8.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams6 {
    public static void main(String args[]) {
        Stream<String> stream = Stream.of("java", "in", "use");
        List<String> testNames = stream.collect(Collectors.toList());

        System.out.println(testNames);
    }
}
