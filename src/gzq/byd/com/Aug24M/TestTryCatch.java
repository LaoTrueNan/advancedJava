package gzq.byd.com.Aug24M;

/**
 * @author 4466184
 * @date 2022/8/24 16:43
 */

public class TestTryCatch {


    public static void main(String[] args) {
        try{
            Thread t1 = new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(10000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
            t1.start();
//            t1.join();

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("stop");
        }
    }
}
