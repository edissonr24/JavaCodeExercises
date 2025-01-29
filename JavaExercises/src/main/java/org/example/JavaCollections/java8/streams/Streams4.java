package org.example.SimpleExamples.java8.streams;

import java.util.stream.Stream;

public class Streams4 {
    public static void main(String[] args) {
        Stream<Long> iterateNumbers = Stream.iterate(1L, n -> n + 1).limit(10);
        iterateNumbers.forEach(System.out::println);
    }
}
