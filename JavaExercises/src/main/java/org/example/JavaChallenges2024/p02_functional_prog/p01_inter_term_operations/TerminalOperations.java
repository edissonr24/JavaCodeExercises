package org.example.JavaChallenges2024.p02_functional_prog.p01_inter_term_operations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalOperations {

    public static void main(String[] args) {

        /**
         * 01. forEach
         */
        printSpace("forEach");
        List<String> names = new ArrayList<>();
        names.add("Ram");
        names.add("Sham");
        names.add("Krishna");
        names.stream().forEach(System.out::println);

        /*Stream<String> stream1 = Stream.of("apple", "banana", "orange", "grape");
        stream1.forEach(System.out::println);*/


        /**
         * 02. forEachOrdered
         */
        printSpace("forEachOrdered");
        /*List<String> names2 = new ArrayList<>();
        names2.add("Ram");
        names2.add("Sham");
        names2.add("Krishna");
        names2.stream().parallel().forEachOrdered(System.out::println);*/

        // In Java 8, the forEachOrdered() method is similar to the forEach() method, but it ensures that the elements are
        // processed in the encounter order of the stream. This is particularly useful when you're dealing with parallel
        // streams or streams where the encounter order matters.

        // Create a stream of strings
        Stream<String> stream = Arrays.stream(new String[]{"apple", "banana", "orange", "grape"});

        // Print each element of the stream in encounter order
        stream.parallel() // Convert the stream to a parallel stream
                .forEachOrdered(System.out::println);

        /**
         * 03. toArray
         */
        printSpace("toArray");
        List<String> list1 = Arrays.asList("apple", "banana", "orange", "grape");
        //String[] arrayString = list1.stream().toArray(size -> new String[size]);
        String[] arrayString = list1.toArray(String[]::new);
        for ( String value:arrayString) {
            System.out.println(value);
        }

        /*// Create a stream of strings
        Stream<String> stream = Stream.of("apple", "banana", "orange", "grape");

        // Convert the stream into an array of strings
        String[] array = stream.toArray(String[]::new);

        // Print the elements of the array
        System.out.println(Arrays.toString(array));*/

        /**
         * 04. reduce
         */
        printSpace("reduce");
        // A simple sum operation using a for loop.
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        for (int i : numbers) {
            sum += i;
        }
        System.out.println("sum : " + sum); // 55

        // The equivalent in Stream.reduce()
        int[] numbers2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // 1st argument, init value = 0
        int sum2 = Arrays.stream(numbers2).reduce(0, (a, b) -> a + b);
        int sum3 = Arrays.stream(numbers2).sum();

        List<Integer> numbersListE = Arrays.asList(1, 2, 3, 4, 5);
        int sum4 = numbersListE.stream().mapToInt(Integer::intValue).sum();

        System.out.println("sum : " + sum2); // 55

        /**
         * 05. collect
         */
        printSpace("collect");
        ArrayList<Student> listOfStudent = new ArrayList<Student>();
        listOfStudent.add(new Student(101, "MCA", "Ram"));
        listOfStudent.add(new Student(102, "MCA", "Sham"));
        listOfStudent.add(new Student(103, "MCA", "Krishna"));
        listOfStudent.add(new Student(104, "MCA", "Satyam"));
        listOfStudent.add(new Student(105, "MCA", "Joshi"));
        List<Student> filteredList = listOfStudent.stream()
                .filter((student) -> student.getRollNo() > 103).collect(Collectors.toList());
        for (Student e:filteredList) {
            System.out.println("Student: " + e.getName() + " - " + e.getRollNo());
        }

        filteredList.forEach(s->System.out.println("Student: " + s.getName() + " - " + s.getRollNo()));

        /**
         * 06. min
         */
        printSpace("min");
        // Create a list of integers
        List<Integer> numbers3 = Arrays.asList(3, 1, 4, 1, 5, 9, 2, 6);
        Optional<Integer> min = numbers3.stream().min(Integer::compare);
        if (min.isPresent()) {
            System.out.println("Min: " + min.get());
        } else {
            System.out.println("Min does not exist");
        }


        /**
         * 07. max
         */
        printSpace("max");
        // Create a list of integers
        List<Integer> numbers4 = Arrays.asList(3, 1, 4, 1, 5, 9, 2, 6);
        Optional<Integer> max = numbers4.stream().max(Integer::compare);
        if (max.isPresent()) {
            System.out.println("Max: " + max.get());
        } else {
            System.out.println("Max does not exist");
        }


        /**
         * 08. count
         */
        printSpace("count");
        List<String> names2 = new ArrayList<String>();
        names2.add("Hi");
        names2.add("Hello");
        names2.add("Java Website");
        names2.add("JavaGoal.com");
        long count = names2.stream().count();
        System.out.println("Count of element of Stream is = " + count);


        /**
         * 09. anyMatch
         */
        printSpace("anyMatch");
        List<String> names3 = new ArrayList<String>();
        names3.add("Java");
        names3.add("Goal");
        names3.add("Website");
        names3.add("JavaGoal.com");

        boolean anyMatch = names3.stream().anyMatch(x->x.equalsIgnoreCase("Java"));
        System.out.println("Is string found = " + anyMatch);

        boolean anyMatch2 = names3.stream().anyMatch(x->x.startsWith("G"));
        System.out.println("Is string start with G = " + anyMatch2);

        List<Integer> numbers5 = Arrays.asList(13, 82, 43, 41);
        boolean isMatchedNumbers = numbers5.stream().anyMatch((a) -> (a > 20));
        System.out.println("Is a number > 20 = " + isMatchedNumbers);



        /**
         * 10. allMatch
         */
        printSpace("allMatch");
        List<String> names4 = new ArrayList<String>();
        names4.add("Java");
        names4.add("Java Goal");
        names4.add("Java Website");
        names4.add("JavaGoal.com");
        boolean isAllStringMatched = names4.stream().allMatch(c -> c.startsWith("Java"));
        System.out.println("Is isAllStringMatched = " + isAllStringMatched);

        List<Integer> numbers6 = Arrays.asList(13, 82, 43, 41);
        boolean isAllnumbersMatched = numbers6.stream().allMatch((a) -> (a > 55));
        System.out.println("Is all number greater than 55 = "+isAllnumbersMatched);


        /**
         * 11. noneMatch
         */
        printSpace("allMatch");
        List<String> names6 = new ArrayList<String>();
        names6.add("Java");
        names6.add("Java Goal");
        names6.add("Java Website");
        names6.add("JavaGoal.com");
        boolean isNoneStringMatched = names6.stream().noneMatch((a) -> a.startsWith("Web"));
        System.out.println("None of the string Start with Web = "+isNoneStringMatched);

        boolean isNoneStringMatched2 = names6.stream().noneMatch(x-> x.startsWith("Java"));
        System.out.println("None of the string Start with Java = "+isNoneStringMatched2);

        /**
         * 12. findFirst
         */
        printSpace("findFirst");
        List<Integer> numbers7 = Arrays.asList(2,3,4,5,6);
        Optional<Integer> first = numbers7.stream().findFirst();
        if (first.isPresent()) {
            System.out.println("First is present: " + first.get());
        } else {
            System.out.println("Value no present");
        }

        /**
         * 13. findAny
         */
        printSpace("findAny");
        List<Integer> numbers8 = Arrays.asList(2,3,4,5,6);
        Optional<Integer> anyNumber = numbers7.stream().findAny();
        if (anyNumber.isPresent()) {
            System.out.println("Any is present: " + anyNumber.get());
        } else {
            System.out.println("Value no present");
        }


    }


    public static void printSpace(String text) {
        System.out.println("-------------------------------" + text + "-----------------------------------");
    }

}

