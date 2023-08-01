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
        int soldierNum = scanner.nextInt();
        int[] soldier = new int[soldierNum];
        for (int i = 0; i < soldierNum; i++) {
            soldier[i] = scanner.nextInt();
        }

        // minimum time is the distance between the closest soldier to the middle of the bridge and 0 or

        // odd or even
        // odd soldiers just
        int min=0,max=Integer.MAX_VALUE;

    }
}
