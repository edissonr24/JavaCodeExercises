package org.example.SimpleExamples.java8.streams;

import java.util.Arrays;
import java.util.List;

public class Count {
    public static void main(String args[]) {
        List<String> data = Arrays.asList("java", "not", "in", "use", "jesus");

        long result = data.stream().filter(s -> s.startsWith("j")).count();

        System.out.println(result);
    }
}
