package gzq.byd.com.mthread;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

public class TestMain {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i =0;;i++){
                    try{
                        Thread.sleep(1000);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                    System.out.println(i);
                }
            }
        });
        thread.setDaemon(true);
        thread.start();

        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
