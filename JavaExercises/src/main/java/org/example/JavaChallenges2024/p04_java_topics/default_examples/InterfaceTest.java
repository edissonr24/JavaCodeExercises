package org.example.JavaChallenges2024.p04_java_topics.default_examples;

public class InterfaceTest implements Interface1, Interface2 {
    @Override
    public void method1(String str) {

    }

    @Override
    public void log(String str) {
        Interface1.super.log(str);
    }

    @Override
    public void method2() {

    }
}
