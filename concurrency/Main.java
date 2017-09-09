package concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        simpleThreads();
        executors();
    }

    private static void executors() {
        // Cached thread pool
        System.out.println("CACHED THREAD POOL");
        ExecutorService ex = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++) {
            ex.execute(new LiftOff());
        }
        ex.shutdown();

        // Fixed thread pool
        System.out.println("FIXED THREAD POOL");
        ExecutorService ex2 = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 5; i++) {
            ex2.execute(new LiftOff());
        }
    }

    private static void simpleThreads() {
        // In main thread
        System.out.println("IN MAIN THREAD");
        LiftOff liftOff = new LiftOff();
        liftOff.run();

        // In another thread
        System.out.println("IN ANOTHER THREAD");
        Thread t = new Thread(new LiftOff());
        t.start();
        System.out.println("Waiting for LiftOff");

        // In many another threads
        System.out.println("IN MANY ANOTHER THREADS");
        for (int i = 0; i < 5; i++) {
            new Thread(new LiftOff()).start();
        }
    }
}
