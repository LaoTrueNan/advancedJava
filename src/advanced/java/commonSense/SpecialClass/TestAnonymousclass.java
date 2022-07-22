package advanced.java.commonSense.SpecialClass;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestAnonymousclass {
    public static void main(String[] args) {
        ForMap<Norwich> forMap = new ForMap<Norwich>(Norwich::getANorwich);

//        anonymous class can only implement interfaces with only 1 method
        System.out.println(forMap.getOne(new Norwich(9)));


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
                System.out.println("线程结束");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "t2");
        t2.start();
        try {
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }



        Yxj<Norwich> norwichYxj = new Yxj<>(Norwich::compareOrder);
        norwichYxj.addItem(new Norwich(9));
        norwichYxj.addItem(new Norwich(1));
        System.out.println(norwichYxj.sort());
        int a = -2;
        System.out.println(~a);
//        System.out.println(ClassLayout.parseInstance(t2).toPrintable());
    }
}
