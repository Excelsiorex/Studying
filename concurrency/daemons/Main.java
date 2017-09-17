package concurrency.daemons;

import java.util.concurrent.TimeUnit;

public class Main implements Runnable {
    public static void main(String[] args) {
        try {
            createDaemons(100);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void createDaemons(int count) throws Exception {
        for (int i = 0; i < count; i++) {
            Thread daemon = new Thread(new Main());
            daemon.setDaemon(true);
            daemon.setName("My thread " + i);
            daemon.start();
        }
        System.out.println("All daemons started");
        TimeUnit.MILLISECONDS.sleep(175);
    }

    @Override
    public void run() {
        try {
            while (true) {
                TimeUnit.MILLISECONDS.sleep(100);
                System.out.println(Thread.currentThread() + " " + this);
            }
        } catch (InterruptedException e) {
            System.out.println("sleep() interrupted");
        }
    }
}
