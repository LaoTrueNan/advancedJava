package advanced.java.commonSense.SpecialClass;

import org.openjdk.jol.info.ClassLayout;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestAnonymousclass {
    public static void main(String[] args) {
        ForMap forMap = new ForMap();
//        anonymous class can only implement interfaces with only 1 method
        forMap.addItem("first", () -> new Norwich());
        System.out.println(forMap.getOne());


        List<Norwich> norwichList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Norwich o = new Norwich(i);
            norwichList.add(o);
        }
        List<Integer> collect = norwichList.stream().filter(v -> v.getOrder() > 2).map(v -> v.getOrder()).collect(Collectors.toList());
        System.out.println(collect);

//        Thread t1 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                try {
//                    Thread.sleep(1000);
//                    System.out.println("waiting");
//                    synchronized (collect) {
//                        wait();
//                    }
//                    System.out.println("woken up");
//                    System.out.println(Thread.currentThread().getName());
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        });


        Thread t2 = new Thread(() -> {
            try {
                Thread.sleep(1000);
                System.out.println(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "t2");
        t2.start();
        System.out.println(ClassLayout.parseInstance(t2).toPrintable());
    }
}
