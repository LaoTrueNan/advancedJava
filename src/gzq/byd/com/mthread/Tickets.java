package gzq.byd.com.mthread;

public class Tickets {
    public int totalNum = 100;
    public String name;
    public void decr(){
        if(this.totalNum>0){
            this.totalNum--;
        }
    }

    public void incr(){
        this.totalNum++;
    }
}
