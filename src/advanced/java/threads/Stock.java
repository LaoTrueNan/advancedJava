package advanced.java.threads;

public class Stock {
    public static int num = 10;


    public static void decr(){
        if(num>0){
            System.out.println(Thread.currentThread().getName()+" got the No."+ --num);
        }
    }
}
