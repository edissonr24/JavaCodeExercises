package org.example.SimpleExamples.java8.streams;

import java.util.Arrays;
import java.util.stream.Stream;

public class Streams3 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.generate(() -> "hello").limit(10);
        String[] testStrArr = stream.toArray(String[]::new);
        System.out.println(Arrays.toString(testStrArr));
    }
}
