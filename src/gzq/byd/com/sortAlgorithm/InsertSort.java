package gzq.byd.com.sortAlgorithm;
/**
 * 直接插入排序
 */
public class InsertSort {
//    遍历第i个时，前i-1个是有序的
    public void insertSort(int[] a){
//        第0个有序
        for (int i = 1; i < a.length; i++) {
            int temp = a[i];
            int j;
            for(j = i-1;j>=0 && temp<a[j];j--){
                a[j+1] = a[j];
            }
            a[j+1] = temp;
            System.out.printf("No.%d:\t",i);
            SortUtil.showAll(a);
        }
    }


    public static void main(String[] args) {
        int[]a = new int[]{4,6,17,93,2,348,8,35,87,65,243,356,8};
        InsertSort insertSort = new InsertSort();
        insertSort.insertSort(a);
    }
}
