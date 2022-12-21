package gzq.byd.com.luogu.P1179;

import java.util.Scanner;

/**
 * luogu P1179
 */
public class HowMany2 {

    // 直接统计相同位数
    public static int cnt(int a,int b,int bits){
        int res = 0;
        if(bits==1){
            if(a<=2&&b>=2){
                return 1;
            }
        }else{
            bits--;
            a=a/base(bits);
            b=b/base(bits);
//            cnt()

        }
        return res;
    }

    public static int base(int a){
        int base = 1;
        for(int k = 0;k < a;k++){
            base*=10;
        }
        return base;
    }

    public static void main(String[] args) {
//        2,147,483,647
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        int r = scanner.nextInt();
        int rtmp = r,ltmp = l,j = 0,i=0;
        int res = 0;
        while(rtmp!=0){
            rtmp/=10;
            j++;
        }
        while (ltmp != 0) {
            ltmp/=10;
            i++;
        }
        //22-189=> 22-99 &&  100-189
        if(i<j){
            //外循环
            for(int out = 0;out<=j-i;out++){
                int left=base(i+out-1),right=base(i+out)-1;
                if(left<l){
                    left = l;
                }
                if(right>r){
                    right = r;
                }
                res+=cnt(left,right,i+out);
            }
        }else{
            res = cnt(l,r,i);
        }
        System.out.println(res);
    }

}
