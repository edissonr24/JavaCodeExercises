package org.example.JavaChallenges2024.p02_functional_prog.p03_fp_course;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FP03BehaviorParameterization {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

        filterAndPrint(numbers, x -> x%2==0);
        System.out.println("----------------------------");

        filterAndPrint(numbers, x -> x%2!=0);
        System.out.println("----------------------------");

        filterAndPrint(numbers, x -> x%3==0);
        System.out.println("----------------------------");

        Function<Integer, Integer> mappingFunction = x -> x*x;
        List<Integer> squaredNumbers =  mapAndCreateNewList(numbers, mappingFunction);
        System.out.println(squaredNumbers);
        System.out.println("----------------------------");

        List<Integer> cubedNumbers =  mapAndCreateNewList(numbers, x -> x*x*x);
        System.out.println(cubedNumbers);
        System.out.println("----------------------------");

        List<Integer> doubledNumbers =  mapAndCreateNewList(numbers, x -> x + x);
        System.out.println(doubledNumbers);
    }

    private static void filterAndPrint(List<Integer> numbers, Predicate<? super Integer> predicate) {
        numbers.stream()
                .filter(predicate)
                .forEach(System.out::println);
    }

    private static List<Integer> mapAndCreateNewList(List<Integer> numbers, Function<Integer, Integer> mappingFunction) {
        return numbers.stream()
                .map(mappingFunction)
                .collect(Collectors.toList());
    }
}
