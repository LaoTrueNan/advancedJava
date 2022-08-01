package gzq.byd.com.sortAlgorithm;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * 堆排序，每次构造小顶或者大顶堆，然后首尾元素互换（不能保证其余的是大顶堆）
 */
public class HeapSortTest {

    /**
     * 将大数向上挪动
     * @param a 数组
     * @param ei 位置
     */
    public void siftUp(int[] a,int ei){
        for(int i = (ei>>>1)-1;i>=0;i--){
            int left = (i<<1)+1;
            int temp = left;
            int right = left+1;
            if ( right<ei && a[right] > a[left]) {
                temp=right;
            }
            if(a[i]<a[temp]){
                a[i] = a[i]^a[temp];
                a[temp] = a[i]^a[temp];
                a[i] = a[i]^a[temp];
            }
        }
    }

    public void heapSort(int[] a){
        int nodes = a.length;
        for (int j = nodes;j>1;j--){
            // 每次构造一个大顶堆，然后将堆顶与末尾元素互换，即每次取最大的放在最末尾
            siftUp(a,j);
            a[0] = a[0]^a[j-1];
            a[j-1] = a[0]^a[j-1];
            a[0] = a[0]^a[j-1];
            SortUtil.showAll(a);
        }
    }


    public static void main(String[] args) {
        int[]a = new int[]{4,6,17,93,2,348,8,35,87,65,243,356,8};
//        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(IntStream.of(a).boxed().collect(Collectors.toList()));
//        for (int i = priorityQueue.size();i>0;i--){
//            Integer poll = priorityQueue.poll();
//            System.out.printf("%d\t",poll);
//        }
        HeapSortTest test = new HeapSortTest();
        test.heapSort(a);
    }

}
