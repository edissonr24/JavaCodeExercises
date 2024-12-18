package org.example.JavaChallenges2024.p04_java_topics.default_examples;

public interface Interface2 {

    void method2();

    default void log(String str){
        System.out.println("I2 logging::"+str);
    }

}
