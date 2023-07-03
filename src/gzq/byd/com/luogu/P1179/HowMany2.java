package gzq.byd.com.luogu.P1179;

import java.util.Scanner;

/**
 * luogu P1179
 */
public class HowMany2 {

    /**
     * 统计从0到n中所有数字2的个数
     * @param n
     */
    public int zeroToN(int n){
        int cnt = 0;
        for(int i=1;i<=n;i*=10){
            int higher = n/(i*10), current = n/i%10, lower = n%i;
            if(current>2){
                cnt+=(higher+1)*i;
            }else if(current==2){
                cnt+=higher*i+lower+1;
            }else if(current<2){
                cnt+=higher*i;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(new HowMany2().zeroToN(n));
    }

}
