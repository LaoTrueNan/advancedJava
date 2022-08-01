package gzq.byd.com.sortAlgorithm;

/**
 * 选择排序
 */
public class SelectionSort {

    public void selectionSort(int [] a){
        int minIdx;
        int tmp;
        for (int i = 0; i < a.length-1; i++) {
            minIdx = i;
            for (int j = i+1; j < a.length; j++) {
                if(a[j]<a[minIdx]){
                    minIdx = j;
                }
            }
            // 下标相同时不能使用三步亦或进行值交换
            if(i!=minIdx){
                a[i] = a[i]^a[minIdx];
                a[minIdx] = a[i]^a[minIdx];
                a[i] = a[i]^a[minIdx];
            }
            SortUtil.showAll(a);
        }
    }



    public static void main(String[] args) {
        int[] list = new int[]{4,6,17,93,2,348,8,35,87,65,243,356,8};
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.selectionSort(list);
    }
}
