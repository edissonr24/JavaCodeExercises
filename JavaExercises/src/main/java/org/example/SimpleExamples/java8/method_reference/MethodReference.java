package org.example.SimpleExamples.java8.method_reference;

import java.util.Arrays;
import java.util.List;

public class MethodReference {
    public static void main(String args[]) {

        List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1");
        System.out.println("-------Using Edi Functions--------");
        myList.stream().forEach(s -> System.out.println(s.toUpperCase()));

        System.out.println("-------Using Lambda Functions--------");
        //Using Lambda function to call system.out.println()
        myList.stream().map(s -> s.toUpperCase())
                .forEach(s -> System.out.println(s));

        System.out.println("-------Using Method Reference--------");


        //Using Method reference to call system.out.println()
        myList.stream().map(String::toUpperCase).sorted()
                .forEach(System.out::println);

    }
}
