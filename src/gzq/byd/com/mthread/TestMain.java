package gzq.byd.com.mthread;

public class TestMain {
    private static boolean ready = false;
    private static int number;
    private static class ReaderThread extends Thread {
        public void run() {
            long startTime = System.currentTimeMillis();
            while (!ready)
                Thread.yield();
            long elapsedTime = System.currentTimeMillis()-startTime;
            System.out.println(number+"-------"+elapsedTime+"ms");
        }
    }
    public static void main(String[] args) {
//        Thread thread = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for(int i =0;;i++){
//                    try{
//                        Thread.sleep(1000);
//                    }catch (InterruptedException e){
//                        e.printStackTrace();
//                    }
//                    System.out.println(i);
//                }
//            }
//        });
//        thread.setDaemon(true);
//        thread.start();
        new ReaderThread().start();
//        try {
//            Thread.sleep(10000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        number = 42;
        ready = true;
//        try {
//            System.in.read();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

    }

}
