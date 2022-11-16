package gzq.byd.com.luogu.P1002;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author 4466184
 * luogu P1002 river-crossing soldier
 * 类似: 有障碍物的机器人移动
 * @date 2022/11/14 9:33
 */

public class RiverCrosserP1002 {

    // (3,3)
    // check if coordinate gt 2

    public static int innerAbs(int sub,int subed){
        return Math.abs(sub-subed);
    }

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int size = 0;
//        int [] a = new int[4];
//        while ( scanner.hasNext()) {
//            a[size++] = scanner.nextInt();
//            if (size==4) {
//                break;
//            }
//        }
//
//        int tx = a[0]+1,ty = a[1]+1,hx = a[2],hy = a[3];
//        int flag = 1;



        //2147483648 = 2^31


        // 922京+
        // 9223372兆+
        // 922亿亿+
        System.out.println(Long.MAX_VALUE);
//        long[][] grid = new long[tx][ty];
//        for(int i = 1;i<ty;i++){
//            if(hx==0 && hy==i){
//                flag = 0;
//            }else if((innerAbs(0,hx)==1 && innerAbs(i,hy)==2)||(innerAbs(0,hx)==2 && innerAbs(i,hy)==1)){
//                flag = 0;
//            }
//            grid[0][i] = flag;
//        }
//        flag = 1;
//        for(int j = 1;j<tx;j++){
//            if(hx==j && hy==0){
//                flag = 0;
//            }else if((innerAbs(0,hx)==1 && innerAbs(j,hy)==2)||(innerAbs(0,hx)==2 && innerAbs(j,hy)==1)){
//                flag = 0;
//            }
//            grid[j][0] = flag;
//        }
//
//        for(int i = 1;i<tx;i++){
//            for(int j = 1;j<ty;j++){
//                if(i==hx && j==hy){
//                    grid[i][j] = 0;
//                }else if((innerAbs(i,hx)==1&&innerAbs(j,hy)==2)||(innerAbs(i,hx)==2&&innerAbs(j,hy)==1)){
//                    grid[i][j] = 0;
//                }else{
//                    grid[i][j] = grid[i-1][j] + grid[i][j-1];
//                }
//            }
//        }
//        for(int i =0;i<tx;i++){
//            for (int j=0;j<ty;j++){
//                System.out.printf("%d\t",grid[i][j]);
//            }
//            System.out.println();
//        }
//
//        System.out.println(grid[tx-1][ty-1]);
    }
}
