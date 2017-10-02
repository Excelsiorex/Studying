package concurrency.semaphores;

import java.util.concurrent.Semaphore;

public class Tunnel implements Runnable {
    private int x;
    private Semaphore semaphore;

    Tunnel(int x, Semaphore semaphore) {
        this.x = x;
        this.semaphore = semaphore;
    }

    @Override
    public void run() {
        try {
            semaphore.acquire();
            System.err.println("Permit acquired.");
            for (int i = 1; i < 5; i++) {
                System.err.println("Value of x: " + x);
                x++;
            }
            semaphore.release();
            System.err.println("Permit released.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
