package org.example.JavaChallenges2024.p02_functional_prog.p03_fp_course;

import java.util.List;

public class FP01Structured {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
        printAllNumbersInListStructured(numbers);
        System.out.println("----------------------------");

        numbers.stream().forEach(System.out::println);
        System.out.println("----------------------------");

        printEvenNumbersInListStructured(numbers);
        System.out.println("----------------------------");

        numbers.stream().filter(num -> num%2 == 0).forEach(System.out::println);
    }




    private static void printAllNumbersInListStructured(List<Integer> numbers) {
        // How to loop the numbers?
        for (int number : numbers) {
            System.out.println(number);
        }

    }


    private static void printEvenNumbersInListStructured(List<Integer> numbers) {
        // How to loop the numbers?
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }

    }

}

