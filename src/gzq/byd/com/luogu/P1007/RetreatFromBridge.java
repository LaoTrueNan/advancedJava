/*
 * author guo
 * year 2023
 */
package gzq.byd.com.luogu.P1007;

import java.util.Scanner;

public class RetreatFromBridge {

    // when soldier arrive at 0 or bridgeLength+1, which means he left.
    // the coordinates of bridge are 1,2,.....,bridgeLength

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bridgeLength = scanner.nextInt();
        int center = bridgeLength / 2;
        int soldierNum = scanner.nextInt();
        int[] soldier = new int[soldierNum];
        for (int i = 0; i < soldierNum; i++) {
            soldier[i] = scanner.nextInt();
        }

        // minimum time is the distance between the closest soldier to the middle of the bridge and 0 or end of bridge
        // odd or even
        // odd soldiers just
        int min=0,max=0;
// after resolution
        // left part and right part, min time in which all soldiers retreat towards the half where them at
        // max time in which all soldiers retreat towards the half where them at
        for (int i = 0; i < soldierNum; i++) {
            int i1 = 0,i2=0;
            if(soldier[i]>center){
                i1 = bridgeLength+1-soldier[i];
                i2 = soldier[i];
            }else{
                i1 = soldier[i];
                i2 = bridgeLength+1-soldier[i];
            }
            if(i1>min){
                min = i1;
            }
            if(i2>max){
                max = i2;
            }
        }
        System.out.printf("%d %d",min,max);
    }
}