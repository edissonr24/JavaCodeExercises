package org.example.JavaChallenges2024.p05_threads;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.*;

public class ExecutorServiceCallable {

    private static final Instant INICIO = Instant.now();

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        ExecutorService executor = Executors.newSingleThreadExecutor();

        Callable<String> tarea= ()->{
            Log("Inicio de la tarea");
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Log("Finaliza la tarea");
            return "Resultado de la tarea";
        };

        Future<String> future = executor.submit(tarea);

        Log(future.isDone());
        String resultado = future.get();
        Log(future.isDone());

        Log(resultado);
        executor.shutdown();
    }

    private static void Log(Object mensaje) {
        System.out.println(String.format("%s [%s] %s",
                Duration.between(INICIO, Instant.now()), Thread.currentThread().getName(), mensaje.toString()));
    }
}

/* ExecutorServiceCallable Output
	PT0.068S [pool-1-thread-1] Inicio de la tarea
	PT0.068S [main] false
	PT2.125S [pool-1-thread-1] Finaliza la tarea
	PT2.125S [main] true
	PT2.127S [main] Resultado de la tarea
*/
