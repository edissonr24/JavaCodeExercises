package org.example.SimpleExamples.java8.streams;

import java.util.stream.IntStream;

public class Reduce1 {
    public static void main(String args[]) {

        int result = IntStream.of(1, 2, 3, 4).reduce(0, (a, b) -> a + b);
        System.out.println(result);
    }
}
