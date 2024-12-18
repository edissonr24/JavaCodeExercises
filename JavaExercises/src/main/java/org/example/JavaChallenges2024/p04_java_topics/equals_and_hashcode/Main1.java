package org.example.JavaChallenges2024.p04_java_topics.equals_and_hashcode;

public class Main1 {
    public static void main(String[] args) {
        Person person1 = new Person("John", 30);
        Person person2 = new Person("John", 25);

        System.out.println("Equals: " + person1.equals(person2));
        System.out.println("Hashcode person1: " + person1.hashCode());
        System.out.println("Hashcode person2: " + person2.hashCode());
    }
}
