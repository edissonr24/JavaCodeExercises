package org.example.udemy.threads;

import java.util.concurrent.*;

// Illustrates how Callable, Executors, ExecutorService, and Future are related;
// also shows how they work together to execute a task
public class CallableTest {
    public static void main(String []args) {
        // create an ExecutorService with a fixed thread pool consisting of one thread
        ExecutorService es = Executors.newSingleThreadExecutor();

        // submit the Callable task (asynchronously) to the executor service
        // and store the Future object
        Future<Integer> future = es.submit(() -> 3 + 5); // V call()

        try {
            // get() will block for 500 msecs max.
            // TimeUnit is an enum
            System.out.println("The answer is: "+future.get(500, TimeUnit.MILLISECONDS));
        } catch (InterruptedException | ExecutionException | TimeoutException ex) {
            ex.printStackTrace();
        }

        // shutdown the executor service otherwise this application will never terminate;
        // existing tasks will be allowed to complete but no new tasks accepted
        es.shutdown();
    }
}