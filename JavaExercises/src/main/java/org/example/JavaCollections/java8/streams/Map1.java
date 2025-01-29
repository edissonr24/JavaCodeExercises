package org.example.SimpleExamples.java8.streams;

import java.util.Arrays;
import java.util.List;

public class Map1 {

    public static void main(String args[]) {
        List<String> dataList = Arrays.asList("java", "not", "in", "use");
        dataList.stream().filter(s -> !s.startsWith("n")).map(String::toUpperCase).forEach(t->System.out.println(t));
        System.out.println("----------------------");
        dataList.stream().filter(s -> !s.startsWith("n")).map(String::toUpperCase).forEach(System.out::println);
    }

}
