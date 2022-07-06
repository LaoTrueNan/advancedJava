package advanced.java.threads;

class Connector implements Runnable{

    private Processor processor;
    synchronized void testConnect(){
        processor.testReceive("hello");
    }

    @Override
    public void run() {
        processor = new Processor();
        processor.start();
        testConnect();
    }
}


class Processor implements Runnable{

    private boolean flag;
    private String name;
    private Thread thread;
    public Processor() {
        this.flag = false;
    }

    synchronized void testReceive(String name){
        while(flag){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.name = name;
        flag = true;
        notifyAll();
    }

    synchronized void receive(){
        while(!flag){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        String name = this.name;
        System.out.println(name);
        this.flag = false;
    }

    public void start(){
        this.thread = new Thread(this,"Processor");
        this.thread.start();
    }
    @Override
    public void run() {
        receive();
    }
}

public class TestThread {
    public static void main(String[] args) {
//        Thread processor = new Thread(new Processor(), "Processor");
//        processor.start();

        Thread connector = new Thread(new Connector(), "Connector");
        connector.start();

    }
}
