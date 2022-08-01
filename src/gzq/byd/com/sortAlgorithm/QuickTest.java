package gzq.byd.com.sortAlgorithm;

public class QuickTest implements Runnable{
    private int[] a;
    private int l;
    private int r;
    public int divide(int [] nosort,int left,int right){
        int base = nosort[left];
        while(left<right){
            while(left<right && nosort[right]>=base){
                right--;
            }
            nosort[left] = nosort[right];
            while(left<right && nosort[left]<=base){
                left++;
            }
            nosort[right] = nosort[left];
        }
        nosort[left] = base;
        return left;
    }
    public void quick(int[] a,int left,int right){
        if(left<right){
            int base = divide(a,left,right);
            quick(a,left,base-1);
            quick(a,base+1,right);
        }
    }
    @Override
    public void run(){
        quick(a,l,r);
    }

    public void start(int [] a,int l,int r){
        this.a = a;
        this.l = l;
        this.r = r;
        Thread t1 = new Thread(this,"t1");
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {//base = 10
        int [] noSort = new int[]{4,6,17,93,2,348,8,35,87,65,243,356,8};
        QuickTest quickTest = new QuickTest();
        long startTime = System.currentTimeMillis();
        quickTest.start(noSort,0,noSort.length-1);
        long elapsedTime = System.currentTimeMillis() - startTime;
        System.out.println(elapsedTime);
        SortUtil.showAll(noSort);
    }
}
