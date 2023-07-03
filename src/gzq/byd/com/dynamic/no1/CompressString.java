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
        // 单独记录某个字符被剔除掉之后的压缩结果,但是怎么考虑k呢?
        // 一个字符时输出1

        // 两个相同字符时输出

        // 两个不同字符时输出
        return s.length();
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
