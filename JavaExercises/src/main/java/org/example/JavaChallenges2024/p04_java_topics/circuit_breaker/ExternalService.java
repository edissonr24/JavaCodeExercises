package org.example.JavaChallenges2024.p04_java_topics.circuit_breaker;

import java.util.Random;

// Simulated external service
class ExternalService {
    private Random random = new Random();

    // Simulated method that may fail randomly
    public void doSomething() throws Exception {
        // Simulate service failure with a 10% probability
        if (random.nextDouble() < 0.1) {
            throw new Exception("Service failure");
        }
        System.out.println("Service operation successful");
    }
}
