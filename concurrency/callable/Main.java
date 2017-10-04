package concurrency.callable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main implements Callable<String> {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        List<Future<String>> list = new ArrayList<>();
        Callable<String> callable = new Main();
        for (int i = 0; i < 10; i++) {
            Future<String> future = executorService.submit(callable);
            list.add(future);
        }
        for (Future<String> future : list) {
            try {
                System.out.println("[" + new Date() + "] " + future.get());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        executorService.shutdown();
    }

    @Override
    public String call() throws Exception {
        Thread.sleep(1000);
        return Thread.currentThread().getName();
    }
}
