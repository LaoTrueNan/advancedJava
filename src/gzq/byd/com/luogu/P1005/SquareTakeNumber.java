/*
 * author guo
 * year 2023
 */
package gzq.byd.com.luogu.P1005;

import java.util.Scanner;

public class SquareTakeNumber {
    public static String sub(String minuend,String subtrahend){
        StringBuilder ret = new StringBuilder();
        char[] first = minuend.toCharArray();
        char[] last = subtrahend.toCharArray();
        int len = Math.max(first.length, last.length);

        int[] res = new int[len];
        boolean minux = false;
        int[] iFirst = new int[len];
        int[] iLast = new int[len];
        if(first.length==len){
            for (int i = 0; i < last.length; i++) {
                iFirst[i] = first[first.length-i-1] -'0';
                iLast[i] = last[last.length-i-1] - '0';
            }
            for (int length = last.length; length < first.length; length++) {
                iFirst[length] = first[len-length-1] - '0';
                iLast[length] = 0;
            }
        }else{
            minux = true;
            for (int i = 0; i < first.length; i++) {
                iFirst[i] = last[last.length-i-1] -'0';
                iLast[i] = first[first.length-i-1] - '0';
            }
            for (int length = first.length; length < last.length; length++) {
                iFirst[length] = last[len-length-1] - '0';
                iLast[length] = 0;
            }
        }
        for (int i = 0; i < len; i++) {
            res[i] = 0;
        }
        for (int i = 0; i < len-1; i++) {
            res[i] = (iFirst[i] - iLast[i] + 10)%10;
            if(iFirst[i]<iLast[i]){
                iFirst[i+1]--;
            }
        }
        int flag = 0;
        if(res[len-1]!=0){
            flag = 1;
            if(minux){
                ret.append('-');
            }
            ret.append(Math.abs(res[len-1]));
        }
        for (int i = len-2; i >=0; i--) {
            if(flag==1 || res[i]!=0 ){
                flag = 1;
                ret.append(res[i]);
            }
        }
        if(flag==0){
            return "0";
        }
        return ret.toString();
    }


    public static String add(String a,String b){
        char[] first = a.toCharArray();
        char[] last = b.toCharArray();
        int[] res = new int[Math.max(a.length(),b.length())+1];
        int tmpa=0,tmpb=0;
        for (int i = 0; i < res.length; i++) {
            if(i> first.length-1){
                tmpa = 0;
            }else{
                tmpa = first[first.length-i-1] - '0';
            }
            if(i> last.length-1){
                tmpb = 0;
            }else{
                tmpb = last[last.length-i-1] - '0';
            }
            res[i] = tmpa + tmpb;
        }

        for (int i = 0; i < res.length-1; i++) {
            res[i+1]+=res[i]/10;
            res[i]=res[i]%10;
        }

        int begin = res.length-1;
        while(begin>=0 && res[begin]==0){
            begin--;
        }
        if(begin==-1){
            return "0";
        }
        StringBuilder ret = new StringBuilder();
        for (int i = begin; i >=0; i--) {
            ret.append(res[i]);
        }
        return ret.toString();
    }

    public static String mul(String a,String b){
        StringBuilder ret = new StringBuilder();
        char[] first = a.toCharArray();
        char[] last = b.toCharArray();
        int[] firsti = new int[first.length];
        int[] lasti = new int[last.length];
        for (int i = 0; i < first.length; i++) {
            firsti[i] = first[first.length-i-1]-'0';
        }
        for (int i = 0; i < last.length; i++) {
            lasti[i] = last[last.length-i-1]-'0';
        }

        int[] res = new int[first.length+ last.length + 1];
        for (int i = 0; i < last.length; i++) {
            for (int j = 0; j < first.length; j++) {
                res[i+j]+=firsti[j]*lasti[i];
            }
        }

        for (int i = 0; i < res.length-1; i++) {
            res[i+1]+=res[i]/10;
            res[i]=res[i]%10;
        }
        int flag = 0;
        for (int i = res.length-1; i >=0; i--) {
            if(flag == 1 || res[i]!=0 ){
                flag=1;
                ret.append(res[i]);
            }
        }
        if(flag==0){
            return "0";
        }
        return ret.toString();
    }

    public static String power(int exponent){

        String ret = "0";
        if(exponent>=31){
            int mod = exponent/31;
            int left = exponent%31;
            for (int i = 0; i < mod; i++) {
                ret = add(ret,"2147483648");
            }

            for (int i = 0; i < left; i++) {
                ret = mul("2",ret);
            }
            return ret;
        }else{
            return String.valueOf((int)Math.pow(2,exponent));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 行号
        int row = scanner.nextInt();
        // 列号
        int col = scanner.nextInt();

        String max = power(col);

        int[][] dats = new int[row][col];
        String[][][] ret = new String[row][col][col];

        // 每一行的取数是互不干扰的
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                dats[i][j] = scanner.nextInt();
                //
                ret[i][j][j] = mul(max,String.valueOf(dats[i][j]));
            }
        }

        String result = "0";

        for (int r = 0; r < row; r++) {

            for (int i = 2; i <=col; i++) {
                // nth
                int cnt = col-i+1;
                String val = power(cnt);
                for (int j = 0; j < cnt; j++) {
                    int end = j+i-1;
                    String left = add(mul(String.valueOf(dats[j][end]),val),ret[r][j+1][end]);
                    String right = add(mul(String.valueOf(dats[j][end-1]),val),ret[r][j][end-1]);
                    String sub = sub(left,right);
                    if(sub.startsWith("-")){
                        ret[r][j][end] = right;
                    }else{
                        ret[r][j][end] = left;
                    }
                }
            }
            result = add(result,ret[r][0][col-1]);
        }
        System.out.println(result);
    }
}
