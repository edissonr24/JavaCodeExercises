package org.example.JavaChallenges2024.p02_functional_prog.p01_inter_term_operations;

public interface Runnable2 {
    public static void main(String[] args) {
       // new Lambda().doWork(() -> processingJob());
    }

    public static void doWork(Runnable r) {
        r.run();
    }

    public static void processingJob() { //do some work }
    }
}
