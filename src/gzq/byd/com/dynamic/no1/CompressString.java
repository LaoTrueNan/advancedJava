/*
 * author guo
 * year 2023
 */
package gzq.byd.com.dynamic.no1;

import java.util.Scanner;

//1个字母不用加1,aa->a2,bbb->b3
public class CompressString {
    /* 1<=s.length<=100 */
    /* 0<=k<=s.length */
    public int getLengthOfOptimalCompression(String s, int k){
        // 算出删除n个的长度,然后再根据其计算n+1
        // 单独记录某个字符被剔除掉之后的压缩结果,但是怎么考虑k呢?
        // 一个字符时输出1,也就是长度1省略  a->a 而不是a1
        // 0-k遍历,留一个下标表示删除n位
        // 用某个状态来模拟
        int ret  = s.length();
        int left = 0,cnt = 1;
        char[] chars = s.toCharArray();
        for (int i = 0; i < s.length()-1; i++) {
            if(chars[i]==chars[i+1]){
                cnt++;
            }else{
                left = i+1;
                if(cnt>1){
                    ret = ret + String.valueOf(cnt).length() - cnt + 1;
                }
                cnt = 1;
            }
        }
        if(left == 0){
            ret = ret + String.valueOf(cnt).length() - cnt + 1;
        }
        // bts[n]表示删除n位之后的最短长度
        int[] bts = new int[k+1];

        bts[0] = ret;
//        for (int i = 1; i < k + 1; i++) {
//            bts[i] = bts[i-1];
//        }
        // 两个相同字符时输出

        // 两个不同字符时输出

        return ret;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CompressString compressString = new CompressString();
        String res = scanner.next("^\\w+");
        // 删除最多k个字符
        int k = scanner.nextInt();
        System.out.println(compressString.getLengthOfOptimalCompression(res,k));
    }
}
