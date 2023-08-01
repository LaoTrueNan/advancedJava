/*
 * author guo
 * year 2023
 */
package JUCTest;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.Function;

/**
 * @date 2023/3/13 9:05
 */

public class TestFuture {

    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                    System.out.println("no.1");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "no1");

        try {
            t1.start();
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                    System.out.println("no.2");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "no2");

        t2.start();


        CompletableFuture<Void> twoSeconds = CompletableFuture.runAsync(()->{
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("I've slept for 5 seconds!");
        }).thenRun(()->{
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("I've slept for 1 seconds!");
        });
        twoSeconds.join();
    }
}
