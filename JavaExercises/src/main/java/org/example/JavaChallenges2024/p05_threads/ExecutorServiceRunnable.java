package org.example.JavaChallenges2024.p05_threads;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceRunnable {

    private static final Instant INICIO = Instant.now();

    public static void main(String[] args) {

        ExecutorService executor = Executors.newSingleThreadExecutor();

        Runnable tarea= ()->{
            Log("Inicio de la tarea");
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Log("Finaliza la tarea");
        };

        executor.submit(tarea);
        executor.shutdown();
    }

    private static void Log(Object mensaje) {
        System.out.println(String.format("%s [%s] %s",
                Duration.between(INICIO, Instant.now()), Thread.currentThread().getName(), mensaje.toString()));
    }
}

/* ExecutorServiceRunnable Output
	PT0.078S [pool-1-thread-1] Inicio de la tarea
	PT1.125S [pool-1-thread-1] Finaliza la tarea
*/
