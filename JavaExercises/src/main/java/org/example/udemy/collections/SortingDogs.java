package org.example.udemy.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingDogs {
    public static void main(String[] args) {
        System.out.println("---------------------fromArray------------------------");
        comparable(new Dog[]{new Dog("Spot", 2), new Dog("Rover", 7)});// just-in-time array

        System.out.println("---------------------comparable------------------------");
        comparable(Arrays.asList(new Dog("Spot", 2), new Dog("Rover", 7)));

        System.out.println("---------------------comparator------------------------");
        comparator(new Dog[]{new Dog("Rover", 7), new Dog("Spot", 2)});

        System.out.println("---------------------comparator------------------------");
        comparator(Arrays.asList(new Dog("Rover", 7), new Dog("Spot", 2)));
    }
    public static void comparable(Dog[] dogArray){
        Arrays.sort(dogArray);
        System.out.println(Arrays.toString(dogArray));// [Dog{name=Rover, age=7}, Dog{name=Spot, age=2}]
    }

    public static void comparable(List<Dog> dogList){
        Collections.sort(dogList);
        System.out.println(dogList);// [Dog{name=Rover, age=7}, Dog{name=Spot, age=2}]
    }

    public static void comparator(Dog[] dogArray){
        // sorts ascending by age
        Comparator<Dog> byAge = Comparator.comparing(dog -> dog.getAge());
        Arrays.sort(dogArray, byAge);
        System.out.println(Arrays.toString(dogArray));// [Dog{name=Spot, age=2}, Dog{name=Rover, age=7}]

        Comparator<Dog> byAgeReversed = Comparator.comparing(Dog::getAge).reversed();
        Arrays.sort(dogArray, byAgeReversed);
        System.out.println(Arrays.toString(dogArray));// [Dog{name=Rover, age=7}, Dog{name=Spot, age=2}]
    }
    public static void comparator(List<Dog> dogList){
        // sorts ascending by age
        Comparator<Dog> byAge = Comparator.comparing(Dog::getAge);
        Collections.sort(dogList, byAge);
        System.out.println(dogList);// [Dog{name=Spot, age=2}, Dog{name=Rover, age=7}]

        Comparator<Dog> byAgeReversed = Comparator.comparing(Dog::getAge).reversed();
        Collections.sort(dogList, byAgeReversed);
        System.out.println(dogList);// [Dog{name=Rover, age=7}, Dog{name=Spot, age=2}]
    }
}
