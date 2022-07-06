package advanced.java.threads;

public class Receiver implements Runnable{

    private final Data data;

    private String notice;

    public Receiver(Data data) {
        this.data = data;
    }

    @Override
    public void run() {
        synchronized (data){
            try {
                data.wait();
                this.notice = data.receive();
            } catch (InterruptedException e) {
                e.printStackTrace();
                this.notice = e.getMessage();
            }
        }
    }

    public String getNotice() {
        return notice;
    }
}
