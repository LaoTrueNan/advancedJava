package gzq.byd.com.Aug5thMultithreading;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 4466184
 * @date 2022/8/5 17:03
 */

public class CleanUp {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        Thread t1 = new Thread(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("t1 running");
        }, "t1");
        Thread t2 = new Thread(() -> {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("t2 running");
        }, "t2");
        Thread t3 = new Thread(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("t3 running");
        }, "t3");
        List<Thread> threads = new ArrayList<>();
        threads.add(t1);
        threads.add(t2);
        threads.add(t3);
        for (Thread t : threads) {
            t.start();
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        Thread thread = new Thread(() -> {
            System.out.println("cleaning");
        }, "cleaner");
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long elapsedTime = System.currentTimeMillis() - startTime;
        System.out.println(elapsedTime);
    }
}
