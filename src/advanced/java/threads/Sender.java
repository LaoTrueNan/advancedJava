package advanced.java.threads;

public class Sender implements Runnable{
    private final Data data;

    public Sender(Data data) {
        this.data = data;
    }

    @Override
    public void run() {
        synchronized (data){
            data.send("hello-world");
            data.notifyAll();
        }
    }
}
