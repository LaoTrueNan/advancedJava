package gzq.byd.com.mthread;

@SuppressWarnings({"unused"})
public class J07Producer implements Runnable{

    private boolean available;
    private Integer left;
    private Thread t;
    private String name;
    public void initialize(int i){
        name = String.valueOf(i);
        left = 5;
        available = false;
    }

    public synchronized void decr(){
        while(available){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        available = true;
        left--;
        notifyAll();
    }

    public synchronized void await(){
        long startTime = System.currentTimeMillis();
        while(!available){
            try {
                System.out.println(Thread.currentThread().getName()+" is waiting.Locked by "+name);
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        available = false;
        int ret = left;
        try {

            Thread.sleep(Integer.valueOf(name)*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        long elapsedTime = System.currentTimeMillis()-startTime;
        System.out.println(Thread.currentThread().getName()+" was woken by "+ name +",waited for "+elapsedTime+"ms");
        notifyAll();
    }

    @Override
    public void run() {
        await();
    }

    public void start(String name){
        t = new Thread(this,name);
        t.start();
    }
}
