package gzq.byd.com.luogu.upstair;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author guo
 * @date 2023/1/12 9:27
 */

public class Upstair {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int b = a.nextInt();
        int a0 = 0;
        int a1 = 0;
        int a2 = 1;
        int res = 0;
        for(int i=0;i<b;i++){
            res = a0 + a1 + a2;
            a0 = a1;
            a1 = a2;
            a2 = res;
        }
        System.out.println(res);
    }
}
