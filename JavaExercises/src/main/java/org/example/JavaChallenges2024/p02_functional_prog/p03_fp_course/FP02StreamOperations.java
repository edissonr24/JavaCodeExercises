package org.example.JavaChallenges2024.p02_functional_prog.p03_fp_course;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FP02StreamOperations {

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

        numbers.stream()
                .distinct() //Stream<T> Intermediate
                .sorted() //Stream<T>
                .forEach(System.out::println); //void
        System.out.println("----------------------------");

        List<Integer> squaredNumbers = numbers.stream()
                .map(num -> num * num)
                .peek(System.out::println)
                .toList();
        System.out.println("----------------------------");

        List<Integer> evenNumbersOnly = numbers.stream()
                .filter(x -> x % 2 == 0) //Stream<T>
                .collect(Collectors.toList());
        System.out.println("----------------------------");

        int sum = numbers.stream()
                .reduce(0, (x,y) -> (x) + (y));
        System.out.println("Sum: " + sum);
        System.out.println("----------------------------");

        int greatest = numbers.stream()
                .reduce(Integer.MIN_VALUE, (x,y)-> x > y?x:y);
        System.out.println("Greatest: " + greatest);
        System.out.println("----------------------------");

        List<String> courses = List.of("Spring", "Spring Boot", "API" , "Microservices","AWS", "PCF","Azure", "Docker", "Kubernetes");

        List<String> coursesSortedByLengthOfCourseTitle = courses.stream()
                .sorted(Comparator.comparing(str -> str.length())).toList();
        System.out.println("Ordered: " + coursesSortedByLengthOfCourseTitle);
        System.out.println("----------------------------");

        List<String> coursesSortedByNameOfCourseTitle = courses.stream()
                .sorted(Comparator.naturalOrder()).toList();
        System.out.println("Ordered by name: " + coursesSortedByNameOfCourseTitle);
    }
}
