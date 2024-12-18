package org.example.JavaChallenges2024.p05_threads;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceAwaitTermination {

    private static final Instant INICIO = Instant.now();

    public static void main(String[] args) throws InterruptedException {

        ExecutorService executor = Executors.newSingleThreadExecutor();

        Runnable tarea= ()->{
            Log("Inicio de la tarea");
            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Log("Finaliza la tarea");
        };

        executor.submit(tarea);

        executor.shutdown();
        executor.awaitTermination(7, TimeUnit.SECONDS);

        Log("El hilo principal continúa...");
    }

    private static void Log(Object mensaje) {
        System.out.println(String.format("%s [%s] %s",
                Duration.between(INICIO, Instant.now()), Thread.currentThread().getName(), mensaje.toString()));
    }
}

/* ExecutorServiceAwaitTermination Output
	--Sin awaitTermination
	PT0.078S [pool-1-thread-1] Inicio de la tarea
	PT0.078S [main] El hilo principal continúa...
	PT5.126S [pool-1-thread-1] Finaliza la tarea

	--Con awaitTermination: 2seg
	PT0.068S [pool-1-thread-1] Inicio de la tarea
	PT2.075S [main] El hilo principal continúa...
	PT5.102S [pool-1-thread-1] Finaliza la tarea

	--Con awaitTermination: 7seg
	PT0.072S [pool-1-thread-1] Inicio de la tarea
	PT5.151S [pool-1-thread-1] Finaliza la tarea
	PT5.151S [main] El hilo principal continúa...
*/