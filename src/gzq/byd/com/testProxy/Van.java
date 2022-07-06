package gzq.byd.com.testProxy;

public class Van implements Car{
    @Override
    public int beep(int times, int time) {
        System.out.println("beeped for "+times);
        return times;
    }

    @Override
    public void start() {

    }
}
