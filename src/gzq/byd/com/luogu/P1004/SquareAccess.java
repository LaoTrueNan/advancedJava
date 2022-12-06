package gzq.byd.com.luogu.P1004;

import java.util.Scanner;

/**
 * @author 4466184
 * luogu P1004
 * @date 2022/11/16 14:28
 */

public class SquareAccess {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cnt = scanner.nextInt();
        //
        int[][] a = new int[cnt+1][3];
        int _cnt = 0;
        int size = 0;
        while(scanner.hasNext()){
            int tmp = scanner.nextInt();
            if(tmp==0){
                _cnt++;
            }
            if(_cnt==3){break;}
            a[size/3][size++%3] = tmp;
            if(size%3==0){
                _cnt = 0;
            }
        }
//        for (int[] ints : a) {
//            for (int anInt : ints) {
//                System.out.printf("%d\t",anInt);
//            }
//            System.out.println();
//        }
        // 遍历同行同列
        // 行号列号同时满足大于等于的加到next域中

        // 如何选举淘汰
//        13-6-4
//        13-7
//        13-14-4 = 31
//        13-4
//        13-15
//
//
//        7-4
//        14-4
//        21-4
//        21-15 = 36
//        21-14
//                4
//        15
//                14
    }

}
