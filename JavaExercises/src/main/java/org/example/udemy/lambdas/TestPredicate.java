package org.example.udemy.lambdas;


import java.util.function.Predicate;

// my own custom Functional Interface
interface Evaluate<T> {
    boolean isNegative(T t);// similar to Predicate
}

public class TestPredicate {

    public static void main(String[] args) {
        // Evaluate<T> is a functional interface i.e. one abstract method:
        //      boolean isNegative(T t); // similar to java.util.function.Predicate
        Evaluate<Integer> lambda = integer -> integer < 0;
        System.out.println("Evaluate: " + lambda.isNegative(-1));
        System.out.println("Evaluate: " + lambda.isNegative(1));

        // Predicate<T> is a functional interface i.e. one abstract method:
        //      boolean test(T t)
        Predicate<Integer> predicate = i -> i < 0;
        System.out.println("Evaluate predicate: " + predicate.test(-1));
        System.out.println("Evaluate predicate: " + predicate.test(1));

        int x = 4;
        System.out.println("Is " + x + " event? " + check(x, integer -> integer % 2 == 0));
        x = 7;
        System.out.println("Is " + x + " event? " + check(x, integer -> integer % 2 == 0));

        String name = "Mr. Edisson";
        System.out.println("Does " + name + " starts with Mr. " + check(name, s -> s.startsWith("Mr.")));

        name = "Ms. Ann";
        System.out.println("Does " + name + " starts with Mr. " + check(name, s -> s.startsWith("Mr.")));

    }

    public static <T> boolean check(T t, Predicate<T> lambda) {
        return lambda.test(t);
    }
}
