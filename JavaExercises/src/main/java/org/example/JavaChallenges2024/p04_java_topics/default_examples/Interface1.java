package org.example.JavaChallenges2024.p04_java_topics.default_examples;

public interface Interface1 {

    void method1(String str);

    default void log(String str){
        System.out.println("I1 logging::"+str);
    }
}