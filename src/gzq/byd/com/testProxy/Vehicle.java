package gzq.byd.com.testProxy;

public class Vehicle implements Car{
    @Override
    public int beep(int times,int time) {
        return times/time;
    }

    @Override
    public void start() {
        System.out.println("started!");
    }
}
