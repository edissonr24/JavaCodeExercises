package org.example.SimpleExamples.java8.streams;

import java.util.Arrays;
import java.util.List;

public class Filter1 {
    public static void main(String args[]) {
        List<String> data = Arrays.asList("java", "not", "in", "use");
        data.stream().filter(s -> !s.equals("in")).forEach(p-> System.out.println(p));


    }
}
