/*
 * author guo
 * year 2023
 */
package advanced.java.threads.threadpool;

import java.util.Comparator;
import java.util.concurrent.*;

public class TestThreadPool {

    public static void main(String[] args) {

        // using Executors.newFixedThreadPool(5); is not recommended because of its blocking queue is too large which may lead OOM
        ExecutorService service = new ThreadPoolExecutor(
                5,
                10,
                60L,
                TimeUnit.SECONDS,
                new PriorityBlockingQueue<>(5, new Comparator<Runnable>() {
                    @Override
                    public int compare(Runnable o1, Runnable o2) {
                        return 0;
                    }
                }),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy());
        try {
            for (int i = 0; i < 15; i++) {
                service.execute(()->{
                    System.out.println(Thread.currentThread().getName() + "  going.....");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "  has gone.....");
                });
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            service.shutdown();
        }

    }
}
