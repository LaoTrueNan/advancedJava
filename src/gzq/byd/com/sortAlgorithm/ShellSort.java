package gzq.byd.com.sortAlgorithm;

import java.util.Arrays;

/**
 * 希尔排序
 */
public class ShellSort {

    //
    public void shellSort(int[] a){
        int gap = a.length/2;
        while(gap>=1){
            for (int i = gap; i < a.length; i++) {
                int j = 0;
                int temp = a[i];
                for(j = i-gap;j>=0&&temp<a[j];j-=gap){
                    a[j+gap] = a[j];
                }
                a[j+gap] = temp;
            }
            SortUtil.showAll(a);
            gap = gap/2;
        }
    }

    public static void main(String[] args) {
        int[] list = new int[]{4,6,17,93,2,348,8,35,87,65,243,356,8};
        ShellSort shellSort = new ShellSort();
        shellSort.shellSort(list);
    }

}
