package org.example.JavaChallenges2024.p02_functional_prog.p03_fp_course;

import java.util.List;

public class FP01Functional {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
        printAllNumbersInListFunctional(numbers);
        System.out.println("----------------------------");

        printEvenNumbersInListFunctional(numbers);
        System.out.println("----------------------------");

        printSquaresOfEvenNumbersInListFunctional(numbers);
    }

    // private static void print(int number) {
    // System.out.println(number);
    // }

    // private static boolean isEven(int number) {
    // return number%2 == 0;
    // }

    private static void printAllNumbersInListFunctional(List<Integer> numbers) {
        // What to do?
        numbers.stream().forEach(System.out::println);// Method Reference
    }

    private static void printEvenNumbersInListFunctional(List<Integer> numbers) {
        // What to do?
        numbers.stream()
                        .filter(number -> number % 2 == 0)  // Lamdba Expression
                                .forEach(System.out::println);     // Method Reference

        // .filter(FP01Functional::isEven)//Filter - Only Allow Even Numbers
    }

    private static void printSquaresOfEvenNumbersInListFunctional(List<Integer> numbers) {
        numbers.stream() // Convert to Stream
                .filter(number -> number % 2 == 0) // Lamdba Expression
                //mapping - x -> x * x
                .map(number -> number * number)
                .forEach(System.out::println);// Method Reference

        // .filter(FP01Functional::isEven)//Filter - Only Allow Even Numbers
    }
}
