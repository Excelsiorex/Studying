package concurrency.semaphores;

import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(1, true);
        Data data = new Data();
        new Thread(new Tunnel(data.x, semaphore)).start();
        new Thread(new Tunnel(data.x, semaphore)).start();
        new Thread(new Tunnel(data.x, semaphore)).start();
        new Thread(new Tunnel(data.x, semaphore)).start();
        new Thread(new Tunnel(data.x, semaphore)).start();
    }
}
