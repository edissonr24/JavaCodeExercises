package org.example.JavaChallenges2024.p02_functional_prog.p01_inter_term_operations;

import java.util.*;
import java.util.stream.Collectors;

public class Exercises01 {

    public static void main(String[] args) {


        /**
        Example 1: filter() and collect() example - Filter all the users whose age is above 30
         */
        User usr1 = new User("1", "alpha", 58);
        User usr2 = new User("2", "beta", 48);
        User usr3 = new User("3", "gama", 22);
        User usr4 = new User("4", "tesla", 30);
        User usr5 = new User("5", "pekka", 12);
        User usr6 = new User("2", "beta", 48);

        List<User> userList = new ArrayList<>();
        userList.add(usr1);
        userList.add(usr2);
        userList.add(usr3);
        userList.add(usr4);
        userList.add(usr5);

        // Filters all the users with age above 30
        List<User> userOver30 = userList.stream().filter(u->u.getAge() > 30).collect(Collectors.toList());
        //userOver30.forEach(user -> System.out.println("User: " + user.getName() + " - Age: " + user.getAge()));

        for (User u:userOver30) {
            System.out.println("User: " + u.getName() + " - Age: " + u.getAge());
        }

        /**
         * Example 2: min() and max() example - Find smallest and largest number
         */
        List<Integer> integerList = Arrays.asList(1,2,4,5,6,7,3,9,5,10,2);

        // Finding Smallest Number
        Optional<Integer> smallestInt = integerList.stream().min(Integer::compare);
        Optional<Integer> smallestInt2 = integerList.stream().min((i,j)-> i.compareTo(j));
        System.out.println("Smallest: " + smallestInt.get() + " - " + smallestInt2.get());

        // Finding Largest Number
        Optional<Integer> largestInt = integerList.stream().max(Integer::compare);
        Optional<Integer> largestInt2 = integerList.stream().max((i,j) -> i.compareTo(j));
        System.out.println("Largest: " + largestInt.get() + " - " + largestInt2.get());

        // Sort List
        integerList.sort((a,b) -> a.compareTo(b));
        integerList.sort(Comparator.naturalOrder());
        integerList.sort(Comparator.reverseOrder());
        System.out.println(integerList);


        /**
         *  Example 3: count() example - Counting the number of elements in a List
         */
        long count = integerList.stream().count();
        System.out.println("Count: " + count);

        long sum = integerList.stream().mapToInt(Integer::valueOf).sum();
        long sum2 = integerList.stream().mapToInt(Integer::intValue).sum();
        long sum3 = integerList.stream().reduce(0, Integer::sum);
        System.out.println("Sum: " + sum + " - " + sum2 + " - " + sum3);

        long sum4 = userList.stream().mapToInt(User::getAge).sum();
        long sum5 = userList.stream().mapToInt(u->u.getAge()).sum();
        System.out.println("Age Sum: " + sum4 + " - " + sum5);

        /**
         * Example 4: distinct() example - Finding Distinct Numbers
         */
        //List<Integer> distinctList =

    }
}
