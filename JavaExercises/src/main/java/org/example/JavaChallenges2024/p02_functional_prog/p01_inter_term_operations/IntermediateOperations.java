package org.example.JavaChallenges2024.p02_functional_prog.p01_inter_term_operations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class IntermediateOperations {

    public static void main(String[] args) {

        /**
         * 01. filter(Predicate<T>)
         */

        // Suppose we have an ArrayList of numbers. We want to print only those numbers which are greater than 3.
        printSpace("filter");
        List<Integer> list1 = Arrays.asList(1,4,2,7,9,10,3);
        //list1.stream().filter(c-> c>3).forEach(System.out::println);
        list1.stream().filter(i -> i % 2 == 0).forEach(x-> System.out.println(x));



        /**
         * 02. map(Function<T>)
         */
        // Suppose we have an ArrayList of numbers. We want to multiple each ArrayList by 2.
        printSpace("map");
        List<Integer> list2 = Arrays.asList(1, 4, 2, 7, 9, 10, 3);
        //list2.stream().map(c-> c*2).forEach(System.out::println);

        // Suppose we have an ArrayList of numbers. We want to multiple each ArrayList by 5.
        list2.stream().map(i -> i*5).forEach(System.out::println);

        /**
         * 03. flatMap(Function<T>)</T>
         */
        // Suppose we want to list all the elements of a list of lists.
        printSpace("flatMap");
        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5),
                Arrays.asList(6, 7, 8)
        );
        listOfLists.stream().flatMap(List::stream).forEach(System.out::println);

        /**
         * 04. sorted(Comparator<T>)
         */
        // Suppose we have an ArrayList of numbers. We want to sort them
        printSpace("sorted");
        List<Integer> list3 = Arrays.asList(1, 4, 2, 7, 9, 10, 3);
        //list3.stream().sorted().forEach(System.out::println);
        list3.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

        /**
         * 05. peek(Consumer<T>)
         */
        printSpace("peek");
        /*Stream.of("apple", "banana", "orange", "grape", "kiwi")
                .filter(fruit -> fruit.length() > 4)
                .peek(fruit -> System.out.println("Filtered: " + fruit)) // Peek to log filtered elements
                .map(String::toUpperCase)
                .peek(fruit -> System.out.println("Mapped: " + fruit)) // Peek to log mapped elements
                .forEach(System.out::println);*/

       // Suppose we have to log the values in a list
       List<String> list4 = Arrays.asList("apple", "banana", "orange", "grape", "kiwi");
       list4.stream().peek(fruit -> System.out.println("Filtered: " + fruit)) // Peek to log filtered elements
                .map(x -> x.toUpperCase())
                .peek(fruit -> System.out.println("Mapped: " + fruit)) // Peek to log mapped elements
                .forEach(System.out::println);

        /**
         * 06. distinct()
         */
        // Suppose we have an ArrayList that contains duplicate numbers. We want to get a stream with distinct values.
        printSpace("distinct");
        List<String> names = new ArrayList<>();
        names.add("Ram");
        names.add("Sham");
        names.add("Krishna");
        names.add("Ram");
        names.add("Sham");
        names.stream().distinct().forEach(x-> System.out.println(x));



        /**
         * 07. limit(long n)
         */
        // Suppose we want to print 5 values
        printSpace("limit");
        List<Integer> numbers = Arrays.asList(2,4,6,8,10,12,7,8,9,10);
        numbers.stream().limit(5).forEach(System.out::println);


        /**
         * 08. skip(long n)
         */
        printSpace("skip");
        // Skip a specified number of elements from the beginning of a stream
        //Stream<Integer> numbersStream = Stream.iterate(1, n -> n + 1).limit(10);
        //numbersStream.skip(5).forEach(System.out::println);

        List<Integer> numbers2 = Arrays.asList(2,4,6,8,10,12,14,16,18,20);
        numbers2.stream().skip(5).forEach(System.out::println);
    }


    public static void printSpace(String text) {
        System.out.println("-------------------------------" + text + "-----------------------------------");
    }
}
