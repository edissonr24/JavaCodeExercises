package org.example.JavaChallenges2024.p02_functional_prog.p03_fp_course;

import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FP03FunctionalInterfaces {

    /*
	 boolean isEven(int x) {
	 	return x%2==0;
	 }

	 int squared(int x) {
	 	return x * x;
	 }
	 */

    @SuppressWarnings("unused")
    public static void main(String[] args) {

        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

        /** Predicate */
        Predicate<Integer> isEvenPredicate = x -> x % 2 == 0;
        Predicate<Integer> isEvenPredicate2 = new Predicate<Integer>() {
            @Override
            public boolean test(Integer x) {
                return x %2 == 0;
            }

        };

        /** Function **/
        Function<Integer, Integer> squareFunction = x -> x * x;
        Function<Integer, Integer> squareFunction2 = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer x) {
                return x * x;
            }

        };

        /** Consumer */
        Consumer<Integer> sysoutConsumer = System.out::println;
        Consumer<Integer> sysoutConsumer2 = new Consumer<Integer>() {
            public void accept(Integer x) {
                System.out.println(x);
            }
        };


        /** Implementation */
        numbers.stream()
                .filter(isEvenPredicate2)
                .map(squareFunction2)
                .forEach(sysoutConsumer2);
        System.out.println("----------------------------");


        /** Sum binary operator */
        BinaryOperator<Integer> sumBinaryOperator = new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer a, Integer b) {
                // TODO Auto-generated method stub
                return a + b;
            }

        };

        int sum = numbers.stream().reduce(0, sumBinaryOperator);
        System.out.println("Sum1: " + sum);
        System.out.println("----------------------------");

        BinaryOperator<Integer> sumBinaryOperator2 = Integer::sum;
        //BinaryOperator<Integer> sumBinaryOperator3 = (x,y) => x + y;
        int sum2 = numbers.stream()
                .reduce(0, sumBinaryOperator2);
        System.out.println("Sum2: " + sum2);
    }
}
