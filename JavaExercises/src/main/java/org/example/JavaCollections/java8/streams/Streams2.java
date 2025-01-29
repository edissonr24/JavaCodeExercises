package org.example.SimpleExamples.java8.streams;

import java.util.ArrayList;
import java.util.List;

public class Streams2 {
    public static void main(String[] args) {

        List<String> items = new ArrayList<>();
        items.add("test1");
        items.add("test2");
        items.add("test3");
        items.add("test4");
        items.add("test5");

        items.stream().forEach(s -> System.out.println(s));
    }
}
