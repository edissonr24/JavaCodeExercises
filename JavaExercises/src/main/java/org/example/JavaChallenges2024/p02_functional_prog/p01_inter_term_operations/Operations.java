package org.example.JavaChallenges2024.p02_functional_prog.p01_inter_term_operations;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Operations {

    public static void main(String[] args) {

        printSpace("INTERMEDIATE OPERATIONS");
        /**
         * 01. filter(Predicate<T>)
         */
        // Suppose we have an ArrayList of numbers. We want to print only those numbers which are greater than 3.
        printSpace("01. filter");
        List<Integer> list1 = Arrays.asList(1,4,5,6,7,10,9);
        List<Integer> filtered1 = list1.stream().filter(x-> x>3).collect(Collectors.toList());
        filtered1.forEach(System.out::print);
        System.out.println("");

        // Print only odd(impar) numbers
        list1.stream().filter(x -> x % 2 > 0).forEach(c -> System.out.print(c + " - "));


        /**
         * 02. map(Function<T>)
         */
        // Suppose we have an ArrayList of numbers. We want to multiple each ArrayList by 2.
        printSpace("map");
        List<Integer> list02 = Arrays.asList(1, 4, 2, 7, 9, 10, 3);
        List<Integer> multiply = list02.stream().map(c -> c*2).collect(Collectors.toList());
        multiply.forEach(v -> System.out.print(v + " "));
        System.out.println("");

        // Suppose we have an ArrayList of numbers. We want to multiple each ArrayList by 5.
        list02.stream().map(c -> c*2).forEach(System.out::println);


        /**
         * 03. flatMap(Function<T>)</T>
         * flatMap is a method in Java's Stream API that is used to transform each element of a stream of elements into a
         * stream of other elements, and then concatenate all the streams into a single stream.
         */
        // Suppose we want to list all the elements of a list of lists.
        printSpace("03. flatMap");
        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5),
                Arrays.asList(6, 7, 8)
        );
        List<Integer> allElementsList = listOfLists.stream().flatMap(List::stream).collect(Collectors.toList());
        allElementsList.stream().forEach(System.out::print);
        System.out.println("");
        System.out.println(allElementsList);


        /**
         * 04. sorted(Comparator<T>)
         */
        // Suppose we have an ArrayList of numbers. We want to sort them
        printSpace("sorted");
        List<Integer> list04 = Arrays.asList(1, 4, 2, 7, 9, 10, 3);
        List<Integer> orderedList = list04.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        System.out.println("Ordered list #1: " + orderedList);

        Collections.sort(list04, Comparator.naturalOrder());
        System.out.println("Ordered list #2: " + list04);

        Collections.reverse(list04);
        System.out.println("Ordered list #3: " + list04);


        /**
         * 05. peek(Consumer<T>)
         */
        printSpace("05. peek");
        /*Stream.of("apple", "banana", "orange", "grape", "kiwi")
                .filter(fruit -> fruit.length() > 4)
                .peek(fruit -> System.out.println("Filtered: " + fruit)) // Peek to log filtered elements
                .map(String::toUpperCase)
                .peek(fruit -> System.out.println("Mapped: " + fruit)) // Peek to log mapped elements
                .forEach(System.out::println);*/

       // Suppose we have to log the values in a list
       List<String> list05 = Arrays.asList("apple", "banana", "orange", "grape", "kiwi");
       List<String> result = list05.stream()
               .filter(fruit -> fruit.length() > 4)
               .peek(fruit -> System.out.println("Filtered: " + fruit))
               .map(x -> x.toUpperCase())
               .peek(fruit -> System.out.println("Updated: " + fruit))
               .collect(Collectors.toList());
       System.out.println(result);


        /**
         * 06. distinct()
         */
        // Suppose we have an ArrayList that contains duplicate numbers. We want to get a stream with distinct values.
        printSpace("06. distinct");
        List<String> names06 = new ArrayList<>();
        names06.add("Ram");
        names06.add("Sham");
        names06.add("Krishna");
        names06.add("Ram");
        names06.add("Sham");

        List<String> distinctList = names06.stream().distinct().collect(Collectors.toList());
        System.out.println(distinctList);


        /**
         * 07. limit(long n)
         */
        // Suppose we want to print 5 values
        printSpace("limit");
        List<Integer> numbers07 = Arrays.asList(2,4,6,8,10,12,7,8,9,10);
        numbers07.stream().limit(5).forEach(x -> System.out.print(x + " "));


        /**
         * 08. skip(long n)
         */
        printSpace("skip");
        // Skip a specified number of elements from the beginning of a stream
        Stream<Integer> numbersStream = Stream.iterate(1, n -> n + 1).limit(10);
        numbersStream.skip(5).forEach(System.out::println);
        System.out.println("");

        List<Integer> numbers08 = Arrays.asList(2,4,6,8,10,12,14,16,18,20);
        numbers08.stream().skip(5).forEach(c -> System.out.print(c + " "));


        /*----------------------------------------------------------------------------*/
        printSpace("TERMINAL OPERATIONS");
        /**
         * 09. forEach
         */
        printSpace("09. forEach");
        List<String> names09 = new ArrayList<>();
        names09.add("Ram");
        names09.add("Sham");
        names09.add("Krishna");
        names09.forEach(x -> System.out.print(x + " "));
        System.out.println("");

        Stream<String> stream1 = Stream.of("apple", "banana", "orange", "grape");
        stream1.forEach(System.out::println);


        /**
         * 10. forEachOrdered
         * In Java 8, the forEachOrdered() method is similar to the forEach() method, but it ensures that the elements are
         * processed in the encounter order of the stream. This is particularly useful when you're dealing with parallel
         * streams or streams where the encounter order matters.
         */
        printSpace("10. forEachOrdered");
        List<String> names10 = new ArrayList<>();
        names10.add("Ram");
        names10.add("Sham");
        names10.add("Krishna");
        names10.stream().parallel().forEachOrdered(System.out::println);
        System.out.println("");

        // Create a stream of strings
        Stream<String> stream = Arrays.stream(new String[]{"apple", "banana", "orange", "grape"});

        // Print each element of the stream in encounter order
        stream.parallel() // Convert the stream to a parallel stream
                .forEach(System.out::println);
        System.out.println("");

        // Create a stream of strings
        Stream<String> stream2 = Arrays.stream(new String[]{"apple", "banana", "orange", "grape"});
        stream2.parallel() // Convert the stream to a parallel stream
                .forEachOrdered(System.out::println);


        /**
         * 11. toArray
         */
        printSpace("11. toArray");
        List<String> list11 = Arrays.asList("apple", "banana", "orange", "grape");
        String[] arrayString = list11.stream().toArray(size -> new String[size]);
        for ( String value:arrayString) {
            System.out.println(value);
        }
        System.out.println("");

        // Create a stream of strings
        Stream<String> stream3 = Stream.of("apple", "banana", "orange", "grape");

        // Convert the stream into an array of strings
        String[] array = stream3.toArray(String[]::new);

        // Print the elements of the array
        System.out.println(Arrays.toString(array));


        /**
         * 12. reduce
         */
        printSpace("12. reduce");
        // A simple sum operation using a for loop.
        int[] numbers12 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        for (int i : numbers12) {
            sum += i;
        }
        System.out.println("sum : " + sum); // 55

        // The equivalent in Stream.reduce()
        int[] numbers4 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // 1st argument, init value = 0
        int sum12 = Arrays.stream(numbers4).reduce(0, (a, b) -> a + b);
        System.out.println("sum : " + sum12); // 55


        /**
         * 13. collect
         */
        printSpace("13. collect");
        ArrayList<Student> listOfStudent = new ArrayList<Student>();
        listOfStudent.add(new Student(101, "MCA", "Ram"));
        listOfStudent.add(new Student(102, "MCA", "Sham"));
        listOfStudent.add(new Student(103, "MCA", "Krishna"));
        listOfStudent.add(new Student(104, "MCA", "Satyam"));
        listOfStudent.add(new Student(105, "MCA", "Joshi"));
        List<Student> filteredList = listOfStudent.stream().filter(student -> student.getName().startsWith("S")).collect(Collectors.toList());
        for (Student e:filteredList) {
            System.out.println("Student: " + e.getName() + " - " + e.getRollNo());
        }
        filteredList.forEach(s->System.out.println("Student: " + s.getName() + " - " + s.getRollNo()));


        /**
         * 14. min
         */
        printSpace("14. min");
        // Create a list of integers
        List<Integer> numbers14 = Arrays.asList(3, 1, 4, 1, 5, 9, 2, 6);
        Optional<Integer> min = numbers14.stream().min(Integer::compare);
        if (min.isPresent()) {
            System.out.println("Min: " + min.get());
        } else {
            System.out.println("Min does not exist");
        }

        int min2 = numbers14.stream().min(Integer::compare).orElse(0);
        System.out.println("Min: " + min2);


        /**
         * 15. max
         */
        printSpace("15. max");
        // Create a list of integers
        List<Integer> numbers15 = Arrays.asList(3, 1, 4, 1, 5, 9, 2, 6);
        Optional<Integer> max = numbers15.stream().max(Comparator.naturalOrder());
        numbers15.stream().max(Integer::compare);
        if (max.isPresent()) {
            System.out.println("Max: " + max.get());
        } else {
            System.out.println("Max does not exist");
        }


        /**
         * 16. count
         */
        printSpace("16. count");
        List<String> names16 = new ArrayList<String>();
        names16.add("Hi");
        names16.add("Hello");
        names16.add("Java Website");
        names16.add("JavaGoal.com");
        long count = 1;
        System.out.println("Count of element of Stream is = " + count);


        /**
         * 17. anyMatch
         */
        printSpace("anyMatch");
        List<String> names17 = new ArrayList<String>();
        names17.add("Java");
        names17.add("Goal");
        names17.add("Website");
        names17.add("JavaGoal.com");

        boolean anyMatch = names17.stream().anyMatch(x -> x.equalsIgnoreCase("Java"));
        System.out.println("Is string found = " + anyMatch);

        boolean anyMatch2 = names17.stream().anyMatch(x -> x.startsWith("G"));
        System.out.println("Is string start with G = " + anyMatch2);

        List<Integer> numbers17 = Arrays.asList(13, 82, 43, 41);
        boolean isMatchedNumbers = numbers17.stream().anyMatch(n -> n > 20);
        System.out.println("Is a number > 20 = " + isMatchedNumbers);


        /**
         * 18. allMatch
         */
        printSpace("18. allMatch");
        List<String> names18 = new ArrayList<String>();
        names18.add("Java");
        names18.add("Java Goal");
        names18.add("Java Website");
        names18.add("JavaGoal.com");
        boolean isAllStringMatched = names18.stream().allMatch(x -> x.startsWith("Java"));
        System.out.println("Is isAllStringMatched = " + isAllStringMatched);

        List<Integer> numbers18 = Arrays.asList(13, 82, 43, 41);
        boolean areAllNumbersMatched = numbers18.stream().allMatch(n -> n > 55);
        System.out.println("Is all number greater than 55 = " + areAllNumbersMatched);


        /**
         * 19. noneMatch
         */
        printSpace("19. noneMatch");
        List<String> names19 = new ArrayList<String>();
        names19.add("Java");
        names19.add("Java Goal");
        names19.add("Java Website");
        names19.add("JavaGoal.com");
        boolean isNoneStringMatched = names19.stream().noneMatch(x -> x.startsWith("Web"));
        System.out.println("None of the string Start with Web = "+isNoneStringMatched);

        boolean isNoneStringMatched2 = names19.stream().noneMatch(x -> x.startsWith("Java"));
        System.out.println("None of the string Start with Java = "+isNoneStringMatched2);

        /**
         * 20. findFirst
         */
        printSpace("20. findFirst");
        List<Integer> numbers20 = Arrays.asList(2,3,4,5,6);
        Optional<Integer> first = numbers20.stream().findFirst();
        if (first.isPresent()) {
            System.out.println("First is present: " + first.get());
        } else {
            System.out.println("Value no present");
        }

        /**
         * 21. findAny
         */
        printSpace("21. findAny");
        List<Integer> numbers21 = Arrays.asList(2,3,4,5,6);
        Optional<Integer> anyNumber = numbers21.stream().findAny();
        if (anyNumber.isPresent()) {
            System.out.println("Any is present: " + anyNumber.get());
        } else {
            System.out.println("Value no present");
        }
    }


    public static void printSpace(String text) {
        System.out.println("");
        System.out.println("-------------------------------" + text + "-----------------------------------");
    }
}
