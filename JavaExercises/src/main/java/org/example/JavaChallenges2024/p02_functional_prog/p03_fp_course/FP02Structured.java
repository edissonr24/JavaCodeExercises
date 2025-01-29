package org.example.JavaChallenges2024.p02_functional_prog.p03_fp_course;

import java.util.List;

public class FP02Structured {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

        int sum = addListStructured(numbers);

        System.out.println(sum);
        System.out.println(numbers.stream().reduce(0, Integer::sum));


    }

    private static int addListStructured(List<Integer> numbers) {
        //how to loop?
        //how to store the sum?
        int sum = 0;
        for(int number:numbers) {
            sum += number;
        }
        return sum;
    }
}
