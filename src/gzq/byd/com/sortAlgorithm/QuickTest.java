package gzq.byd.com.sortAlgorithm;

public class QuickTest {
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
        /*O(NlogN)*/
        /*5,6,7,8,9,1,2,3, 9   4*/
    }// 7 9
    public static void main(String[] args) {//base = 10
        int [] noSort = new int[]{1,9,8,7,6,5,4,3,2,10};
        QuickTest quickTest = new QuickTest();
        quickTest.quick(noSort,0,noSort.length-1);
        for (int i : noSort) {
            System.out.format("\t%d",i);
        }
    }
}
