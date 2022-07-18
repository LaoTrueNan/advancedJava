package gzq.byd.com.mthread;

import java.util.Stack;

@SuppressWarnings({"unused"})
public class J07Consumer implements Runnable {

    private Stack producers = new Stack();
    private Thread t;

    public J07Consumer() {
        for(int i=1;i<=3;i++){
            J07Producer pro = new J07Producer();
            pro.initialize(i);
            pro.start("t"+i);
            recycle(pro);
        }
    }

    public void recycle(J07Producer j07Producer){
        producers.push(j07Producer);
    }

    @Override
    public void run() {
        J07Producer fromStack = getFromStack();
        while(fromStack!=null){
            fromStack.decr();
            fromStack = getFromStack();
        }
//        fromStack.decr();
    }

    public void start(){
        t = new Thread(this,"consumerT");
        t.start();
    }

    public J07Producer getFromStack(){
        if(producers.size()>0){
            J07Producer pop = (J07Producer) producers.pop();
            return pop;
        }
        return null;
    }

    public static void main(String[] args) {
        J07Consumer jc = new J07Consumer();
        jc.start();
    }
}
