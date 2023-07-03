/*
 * author guo
 * year 2023
 */
package gzq.byd.com.dynamic.no0;

import java.util.Scanner;

public class CowsTreats {

    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        int[] vals = new int[n];
        for (int i = 0; i < n; i++) {
            vals[i] = scanner.nextInt();
        }

        // 最后一天取,都是第n天乘以值
        int[][] ret = new int[n][n];
        for (int i = 0; i < n; i++) {
            ret[i][i] = n*vals[i];
        }

        // 以2为天数开始

        int day,end,begin;
        for (int len = 2; len <= n; len++) {
            day = n-len+1;
            for (begin = 0; begin < day; begin++) {
                // 第二天应该取两个,加天数减一
                end = begin+len-1;
                ret[begin][end] = Math.max(day*vals[begin]+ret[begin+1][end],day*vals[end]+ret[begin][end-1]);
            }
        }

        System.out.println(ret[0][n-1]);
    }
}
