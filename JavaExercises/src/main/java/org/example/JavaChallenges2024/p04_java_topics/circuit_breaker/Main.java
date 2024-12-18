package org.example.JavaChallenges2024.p04_java_topics.circuit_breaker;

public class Main {
    public static void main(String[] args) {
        CircuitBreaker circuitBreaker = new CircuitBreaker();

        // Simulate service calls
        for (int i = 0; i < 50; i++) {
            System.out.println("Service call #" + (i + 1));
            circuitBreaker.execute();
        }
    }
}
