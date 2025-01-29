package org.example.JavaChallenges2024.p02_functional_prog.p01_inter_term_operations.exercises02;



import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExercises02 {

    public static void main(String[] args) {

        List<Integer> numbersList = Arrays.asList(1, 4, 8, 5, 6, 7, 10, 9, 2, 3, 6);

        printSpace("INTERMEDIATE OPERATIONS");
        /**
         * 01. filter(Predicate<T>)
         */
        // Suppose we have an ArrayList of numbers. We want to print only those numbers which are greater than 3.
        printSpace("01. filter");

        List<Integer> filtered1 = numbersList.stream().filter(x-> x > 3).collect(Collectors.toList());
        filtered1.forEach(System.out::print);
        System.out.println(" ");

        // Print only odd(impar) numbers
        numbersList.stream().filter(x -> x % 2 > 0).forEach(c -> System.out.print(c + " - "));


        /**
         * 02. map(Function<T>)
         */
        // Suppose we have an ArrayList of numbers. We want to multiple each ArrayList by 2.
        printSpace("map");
        List<Integer> multiply = numbersList.stream().map(n -> n * 2).toList();
        multiply.forEach(v -> System.out.print(v + " "));
        System.out.println();

        // Suppose we have an ArrayList of numbers. We want to multiple each ArrayList by 5.
        numbersList.stream().map(c -> c * 5).forEach(System.out::println);


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
        //List<Integer> allElementsList = listOfLists.stream().flatMap(list -> list.stream()).toList();
        List<Integer> allElementsList = listOfLists.stream().flatMap(Collection::stream).toList();
        System.out.println(allElementsList);


        /**
         * 04. sorted(Comparator<T>)
         */
        // Suppose we have an ArrayList of numbers. We want to sort them
        printSpace("sorted");
        List<Integer> orderedList = numbersList.stream().sorted(Comparator.naturalOrder()).toList();
        System.out.println("orderedList: " + orderedList);

        List<Integer> reversedList = numbersList.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println("reversedList: " + reversedList);

        /*Collections.sort(numbersList);
        System.out.println(numbersList);

        Collections.reverse(numbersList);
        System.out.println(numbersList);*/


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
        List<String> fruitsList = Arrays.asList("apple", "banana", "orange", "grape", "kiwi");
        List<String> fruits = fruitsList.stream()
                .filter(f -> f.length() > 4)
                .peek(System.out::println)
                .map(String::toUpperCase)
                .peek(x -> System.out.println("Upper: " + x ))
                .toList();


        /**
         * 06. distinct()
         */
        // Suppose we have an ArrayList that contains duplicate numbers. We want to get a stream with distinct values.
        printSpace("06. distinct");
        List<Integer> distinctNumbers = numbersList.stream().distinct().toList();
        System.out.println("distinctNumbers: " + distinctNumbers);


        /**
         * 07. limit(long n)
         */
        // Suppose we want to print 5 values
        printSpace("07. limit");
        List<Integer> firstFiveNumbers = numbersList.stream().limit(5).toList();
        System.out.println("firstFiveNumbers: " + firstFiveNumbers);


        /**
         * 08. skip(long n)
         */
        printSpace("skip");
        // Skip a specified number of elements from the beginning of a stream
        List<Integer> numberSkip = numbersList.stream().skip(4).toList();
        numberSkip.forEach(System.out::print);


        /*----------------------------------------------------------------------------*/
        printSpace("TERMINAL OPERATIONS");
        /**
         * 09. forEach
         */
        printSpace("09. forEach");
        List<String> names = new ArrayList<>();
        names.add("Ram");
        names.add("Sham");
        names.add("Krishna");
        names.forEach(x -> System.out.println("Value: " + x));


        /**
         * 10. forEachOrdered
         * In Java 8, the forEachOrdered() method is similar to the forEach() method, but it ensures that the elements are
         * processed in the encounter order of the stream. This is particularly useful when you're dealing with parallel
         * streams or streams where the encounter order matters.
         */
        printSpace("10. forEachOrdered");
        List<String> names2 = new ArrayList<>();
        names2.add("Ram");
        names2.add("Sham");
        names2.add("Krishna");

        names2.stream().parallel().forEachOrdered(System.out::println);
        System.out.println();

        // Create a stream of strings
        Stream<String> stream = Arrays.stream(new String[]{"apple", "banana", "orange", "grape"});

        // Print each element of the stream in encounter order
        stream.parallel() // Convert the stream to a parallel stream
                .forEach(System.out::println);
        System.out.println();

        // Create a stream of strings
        Stream<String> stream2 = Arrays.stream(new String[]{"apple", "banana", "orange", "grape"});
        stream2.parallel() // Convert the stream to a parallel stream
                .forEachOrdered(System.out::println);


        /**
         * 11. toArray
         */
        printSpace("11. toArray");
        List<String> fruitsList2 = Arrays.asList("apple", "banana", "orange", "grape");
        //String[] arrayString = list11.stream().toArray(size -> new String[size]);
        String[] arrayString = fruitsList2.toArray(String[]::new);
        for ( String value:arrayString) {
            System.out.println(value);
        }
        System.out.println();

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


        // The equivalent in Stream.reduce()
        int[] numbers4 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // 1st argument, init value = 0
        int sum1 = Arrays.stream(numbers4).reduce(0, Integer::sum);
        System.out.println("sum : " + sum1); // 55

        int sum2 = numbersList.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum2: " + sum2);


        /**
         * 13. collect
         */
        printSpace("13. collect");
        ArrayList<Student> studentsList = new ArrayList<Student>();
        studentsList.add(new Student(101, "MCA", "Ram"));
        studentsList.add(new Student(102, "MCA", "Sham"));
        studentsList.add(new Student(103, "MCA", "Krishna"));
        studentsList.add(new Student(104, "MCA", "Satyam"));
        studentsList.add(new Student(105, "MCA", "Joshi"));
        //List<Student> filteredList = studentsList.stream().filter(student -> student.getName().startsWith("S")).collect(Collectors.toUnmodifiableList());
        List<Student> filteredList = studentsList.stream().filter(student -> student.getName().startsWith("S")).toList();
        System.out.println(filteredList);


        /**
         * 14. min
         */
        printSpace("14. min");
        Optional<Integer> min = numbersList.stream().min(Integer::compare);
        System.out.println("min: " + min.get());

        Integer min2 = numbersList.stream().min(Integer::compare).orElse(0);
        System.out.println("min2: " + min2);


        /**
         * 15. max
         */
        printSpace("15. max");
        Optional<Integer> max = numbersList.stream().max(Integer::compare);
        System.out.println("max: " + max.get());


        /**
         * 16. count names who stars with S
         */
        printSpace("16. count");
        long count = studentsList.stream().filter(student -> student.getName().startsWith("S")).count();
        System.out.println("count: " + count);


        /**
         * 17. anyMatch
         */
        printSpace("anyMatch");
        List<String> books = new ArrayList<String>();
        books.add("Java 1");
        books.add("Goal 1");
        books.add("Website 1");
        books.add("JavaGoal.com 1");

        boolean anyMatch = books.stream().anyMatch(x -> x.equals("Java"));
        System.out.println("anyMatch: " + anyMatch);

        boolean anyMatch2 = books.stream().anyMatch(x -> x.startsWith("X"));
        System.out.println("Is string start with G = " + anyMatch2);


        /**
         * 18. allMatch
         */
        printSpace("18. allMatch");
        boolean isAllStringMatched = books.stream().allMatch(x -> x.endsWith("1"));
        System.out.println("isAllStringMatched: " + isAllStringMatched);


        /**
         * 19. noneMatch
         */
        printSpace("19. noneMatch");
        boolean isNoneStringMatched = books.stream().noneMatch(x -> x.startsWith("F"));
        System.out.println("isNoneStringMatched: " + isNoneStringMatched);

        boolean isNoneStringMatched2 = books.stream().noneMatch(x -> x.startsWith("Java"));
        System.out.println("None of the string Start with Java = "+isNoneStringMatched2);


        /**
         * 20. findFirst
         */
        printSpace("20. findFirst");
        Optional<String> findFirst = books.stream().filter(x -> x.startsWith("J")).findFirst();
        /*if (first.isPresent()) {
            System.out.println("First: " + first.get());
        }*/
        findFirst.ifPresent(s -> System.out.println("first: " + s));


        /**
         * 21. findAny
         */
        printSpace("21. findAny");
        Optional<String> findAny = books.stream().filter(x -> x.contains("Java")).findAny();
        findAny.ifPresentOrElse(s -> System.out.println("findAny: " + findAny.get()), ()-> System.out.println("data not found"));

        Optional<String> findAnyNot = books.stream().filter(x -> x.contains("Java 8")).findAny();
        findAnyNot.ifPresentOrElse(s -> System.out.println("findAnyNot: " + s), ()-> System.out.println("data not found"));

    }


    public static void printSpace(String text) {
        System.out.println(" ");
        System.out.println("-------------------------------" + text + "-----------------------------------");
    }
}
