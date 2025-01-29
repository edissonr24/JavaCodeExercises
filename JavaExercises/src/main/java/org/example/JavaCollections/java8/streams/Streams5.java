package org.example.SimpleExamples.java8.streams;

import java.util.regex.Pattern;

public class Streams5 {
    public static void main(String args[]) {
        String str = "THIS,IS,JAVA!!!!!";
        Pattern.compile(",").splitAsStream(str).forEach(System.out::println);
    }
}
