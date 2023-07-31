/*
 * author guo
 * year 2023
 */
package gzq.byd.com.graph;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 洛谷P1359 租用游艇 有点像货车运输LeetCode
 * s0 利用过河卒的思路
 */
public class HelloGraph {

    // 递归
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        if(n==1 || n==2){
//            System.out.println(scanner.nextInt());
//        }else{
//            int [][] tab = new int[n][n];
//            for (int i = 0; i < n; i++) {
//                for (int j = i+1; j < n ; j++) {
//                    tab[i][j] = scanner.nextInt();
//                }
//            }
//            // after I drew a matrix
//            for (int i = 3; i <= n; i++) {
//                for (int j = 2; j <= i - 1; j++) {
//                    if(tab[0][j-1] + tab[j-1][i-1] < tab[0][i-1]){
//                        tab[0][i-1] = tab[0][j-1] + tab[j-1][i-1];
//                    }
//                }
//            }
//            System.out.println(tab[0][n-1]);
//        }
//
//
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();

        Pattern compile = Pattern.compile("^([\\w\\d]+).([\\w\\d]+)@([\\w\\d]+).com$");
        Matcher matcher = compile.matcher(a);

        while(matcher.find()){
            System.out.println("用户名是"+matcher.group(1)+"."+matcher.group(2));
            System.out.println("注册的网站是"+matcher.group(3));
        }
    }
}
