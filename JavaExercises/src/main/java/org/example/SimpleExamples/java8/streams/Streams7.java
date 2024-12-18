package org.example.SimpleExamples.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams7 {
    public static void main(String args[]) {
        List<Integer> list = new ArrayList<>() ;
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        Stream<Integer> intStream = list.stream();
        Integer[] evenArr = intStream.filter(i -> i % 2 == 0).toArray(
                Integer[]::new);
        System.out.print(evenArr[0]);

        List<Integer> result = list.stream().filter(i -> i % 2==0 ).collect(Collectors.toList());
        System.out.println(result);
    }
}
