package org.example.JavaChallenges2024.p02_functional_prog.p01_inter_term_operations;

import java.util.*;
import java.util.stream.Collectors;


public class Exercises {

    // Example 1: filter() and collect() example - Filter all the users whose age is above 30
    /*public static void main(String[] args) {

        User usr1 = new User("1", "alpha", 58);
        User usr2 = new User("2", "beta", 48);
        User usr3 = new User("3", "gama", 22);
        User usr4 = new User("4", "tesla", 30);
        User usr5 = new User("5", "pekka", 12);

        List<User> userList = new ArrayList<>();
        userList.add(usr1);
        userList.add(usr2);
        userList.add(usr3);
        userList.add(usr4);
        userList.add(usr5);

        // Filters all the users with age above 30
        List<User> ageGreaterThan30 = userList.stream().filter(u -> u.getAge() > 30).collect(Collectors.toList());
        ageGreaterThan30.forEach(user -> System.out.println("User: " + user.getName() + " - " + user.getAge()));

        System.out.println("--------------------------------------------------------");
        ageGreaterThan30.stream().forEach(x -> System.out.println(x.getName() + " - " + x.getAge()));
        System.out.println("--------------------------------------------------------");
        ageGreaterThan30.stream().forEach(System.out::println);


    }*/


    // Example 2: min() and max() example - Find smallest and largest number
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);

        /*// Finding Smallest Number
        Optional<Integer> smallest = numbers.stream().min(Integer::compare);
        Optional<Integer> smallest2 = numbers.stream().min((i,j)->i.compareTo(j));
        System.out.println("Smallest: " + smallest.get() + " - " + smallest2.get());

        // Finding Largest Number
        Optional<Integer> largest = numbers.stream().max(Integer::compare);
        Optional<Integer> largest2 = numbers.stream().max((i,j)->i.compareTo(j));
        System.out.println("Largest: " + largest.get() + " - " + largest2.get());*/

        numbers.sort((a,b) -> a.compareTo(b));
        System.out.println(numbers);

        /*ist list = Arrays.asList("Bob", "Bill", "Ben");
        String message = "Welcome";
        list.forEach( name -> System.out.println(message + " " + name) );
        message = "Goodbye";*/
    }


    // Example 3: count() example - Counting the number of elements in a List
    /*public static void main(String[] args) {
        List<Integer> numbers = Arrays.
                asList(3, 6, 11, 8, 44, 33, 8);

        // Using count() to count the number of elements
        long total = numbers.stream().count();
        System.out.println("Total elements: " + total);
    }*/


    // Example 4: distinct() example - Finding Distinct Numbers
    /*public static void main(String[] args) {

        List<Integer> numbers = Arrays.
                asList(33, 6, 11, 8, 44, 33, 8);

        // Find all distinct numbers
        List<Integer> distinctElement = numbers.stream().distinct().collect(Collectors.toList());

        distinctElement.forEach(x -> System.out.println(x));

    }*/


    // Example 5: map() example - Converting a List of Integers to a List of String
    /*public static void main(String[] args) {

        List<Integer> numbers = Arrays.
                asList(33, 6, 11, 8, 44, 33, 8);

        //Converting a List of Integers to a List of String
        List<String> strNumbers = numbers.stream().map(x -> x.toString()).collect(Collectors.toList());
        strNumbers.forEach(System.out::println);

    }*/


    // Example 6: sorted() example - Sort a List
    /*public static void main(String[] args) {

        List<Integer> numbers = Arrays.
                asList(13, 6, 11, 28, 44, 33, 8);

        //Sort a List with stream.sorted()
        List<Integer> sortedList = numbers.stream().sorted().collect(Collectors.toList());
        List<Integer> sortedListDesc = numbers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("Order: " + sortedList);
        System.out.println("Reverse Order: " + sortedListDesc);

    }*/

}

