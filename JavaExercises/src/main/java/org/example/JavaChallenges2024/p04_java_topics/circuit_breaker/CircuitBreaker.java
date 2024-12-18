package org.example.JavaChallenges2024.p04_java_topics.circuit_breaker;

// Circuit breaker implementation
class CircuitBreaker {
    private static final int THRESHOLD = 3; // Number of failures to trip the circuit breaker
    private int failureCount = 0;
    private boolean isOpen = false;

    // Reference to the external service
    private ExternalService externalService = new ExternalService();

    public void execute() {
        try {
            // Check if the circuit breaker is open
            if (isOpen) {
                System.out.println("Circuit breaker is open. Service call is blocked.");
                return;
            }

            // Call the external service
            externalService.doSomething();
            System.out.println("Service call successful.");
            reset(); // Reset the failure count if the call succeeds
        } catch (Exception e) {
            System.out.println("Service call failed: " + e.getMessage());
            handleFailure(); // Increment failure count and potentially trip the circuit breaker
        }
    }

    private void handleFailure() {
        failureCount++;
        if (failureCount >= THRESHOLD) {
            isOpen = true; // Trip the circuit breaker if failure count exceeds threshold
            System.out.println("Circuit breaker tripped due to multiple failures.");
        }
    }

    private void reset() {
        failureCount = 0; // Reset failure count
        isOpen = false; // Reset circuit breaker
    }
}
