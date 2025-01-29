package org.example.JavaChallenges2024.p02_functional_prog.p01_inter_term_operations.exercises01;

import java.util.*;
import java.util.stream.Collectors;

public class StreamsExercises01 {



    public static void main(String[] args) {

        User usr1 = new User("1", "alpha", 58);
        User usr2 = new User("2", "beta", 48);
        User usr3 = new User("3", "gama", 22);
        User usr4 = new User("4", "tesla", 30);
        User usr5 = new User("5", "pekka", 12);
        User usr6 = new User("6", "omega", 48);

        List<User> userList = new ArrayList<>();
        userList.add(usr1);
        userList.add(usr2);
        userList.add(usr3);
        userList.add(usr4);
        userList.add(usr5);
        userList.add(usr6);

        /** Example 1: filter() and collect() example - Filter all the users whose age is above 30. */
        List<User> usersOver30 = userList.stream().filter(user -> user.getAge() > 30).toList();
        System.out.println(usersOver30);
        System.out.println("===========================================================================");

        /** Example 2: min() and max() example - Find smallest and largest number. */
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 5, 2);

        // Min
        Optional<Integer> smallestNumber = numbers.stream().min(Comparator.naturalOrder());
        //System.out.println(smallestNumber.get());
        smallestNumber.ifPresentOrElse(System.out::println,  () -> System.out.println("No elements in the list") );

        // Max
        Optional<Integer> biggestNumber = numbers.stream().max(Integer::compareTo);
        /*if (biggestNumber.isPresent()){
            System.out.println(biggestNumber.get());
        }*/
        biggestNumber.ifPresent(System.out::println);

        /** Example 3: count() example - Counting the number of users in a List */
        long count = userList.size();
        System.out.println("count: " + count);
        long countBiggerThan30 = userList.stream().filter(user -> user.getAge() > 30).count();
        System.out.println("countBiggerThan30: " + countBiggerThan30);
        List<Integer> list3YoungestAges = userList.stream().map(User::getAge).sorted(Comparator.naturalOrder()).limit(3).toList();
        System.out.println("list3YoungestAges: " + list3YoungestAges);
        //List<Integer> list3OlderAges = userList.stream().map(User::getAge).sorted(Integer::min).limit(3).toList();
        List<Integer> list3OlderAges = userList.stream().map(User::getAge).sorted(Comparator.reverseOrder()).limit(3).toList();
        System.out.println("list3OlderAges: " + list3OlderAges);
        Map<Integer, List<User>> usersGroupByAge = userList.stream().collect(Collectors.groupingBy(User::getAge));
        System.out.println("usersGroupByAge: " + usersGroupByAge);
        Optional<User> oldestUser = userList.stream().max(Comparator.comparingInt(User::getAge));
        System.out.println("oldestUser: " + oldestUser.get());
        List<User> the3YoungestUsers = userList.stream().sorted(Comparator.comparingInt(User::getAge)).limit(3).toList();
        System.out.println("the3YoungestUsers: " + the3YoungestUsers);
        List<User> the3OldestUsers = userList.stream().sorted(Comparator.comparingInt(User::getAge).reversed()).limit(3).toList();
        System.out.println("the3OldestUsers: " + the3OldestUsers);

        /** Example 4: distinct() example - Finding Distinct Numbers */
        List<Integer> distinctNumbers = numbers.stream().distinct().toList();
        distinctNumbers.forEach(System.out::println);
        System.out.println("----");

        /** Example 5: map() example - Converting a List of Integers to a List of String */
        List<String> stringList = numbers.stream().map(String::valueOf).distinct().sorted(Comparator.reverseOrder()).toList();
        for (String c : stringList) {
            System.out.println(c);
        }
    }



}
