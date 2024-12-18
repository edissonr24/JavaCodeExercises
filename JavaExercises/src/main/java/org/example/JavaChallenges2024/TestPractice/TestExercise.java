package org.example.JavaChallenges2024.TestPractice;

import org.example.JavaChallenges2024.p03_collections.Ej03_Map.Ej03_Book;

import java.util.HashMap;
import java.util.Map;

public class TestExercise {


    public static void main(String[] args) {

        char[] testArray =  {'a','a','b','b','c','c','c'};

        char[] result = compres(testArray);


    }

    public static char[] compres(char[] inputArray) {

        Map<Character, Integer> myMap = new HashMap<>();

        for (char c : inputArray) {
            int count = myMap.getOrDefault(c, 0);
            myMap.put(c, ++count);
        }

        StringBuilder resultString = new StringBuilder();


        for (Map.Entry<Character, Integer> entry : myMap.entrySet()) {
            System.out.println("Result " + entry.getKey() + " - " + entry.getValue());

            resultString.append(entry.getKey());
            resultString.append(String.valueOf(entry.getValue()));

        }
        System.out.println("Result: " + resultString);

    return null;
    }



}
