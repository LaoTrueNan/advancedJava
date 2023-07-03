/*
 * author guo
 * year 2023
 */
package JUCTest;

import java.util.concurrent.CompletableFuture;
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


        CompletableFuture<Void> future = CompletableFuture.supplyAsync(()->{
            t1.start();
            return null;
        });

        CompletableFuture<Void> future2 = CompletableFuture.supplyAsync(()->{
            t2.start();
            return null;
        });


    }
}
