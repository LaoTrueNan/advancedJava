package gzq.byd.com.mthread;

public class Tickets implements Runnable {

    private int a = 1;


    boolean flag = true;

    @Override
    public void run() {
        if (flag) {
            try {
                System.out.println(Thread.currentThread().getName() + "正在排队...");
                buy();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }


    public synchronized void buy(){
        if (a <= 0) {
            flag = false;
            System.out.println(Thread.currentThread().getName() + "没抢到票");
            return;
        }
        System.out.println(Thread.currentThread().getName() + "拿到了第" + a-- + "张票");
    }

    public static void main(String[] args) {
        Tickets t = new Tickets();
        new Thread(t, "张三").start();
        new Thread(t, "李四").start();
        new Thread(t, "王五").start();
    }
}
