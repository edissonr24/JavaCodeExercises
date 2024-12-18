package org.example.JavaChallenges2024.p04_java_topics.java8;

public class Factorial {

    public static void main (String args[]) {
        System.out.println("Hola mundo");
        //System.out.println("factorial de 6 es: " + factorial(6));
    }

    public int factorial (int n) {
        int fact = n;
        for (int i=n-1; i>1; i--) {
            fact = fact * i;
        }
        return fact;
    }
}
