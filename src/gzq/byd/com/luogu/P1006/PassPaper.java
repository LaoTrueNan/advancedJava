/*
 * author guo
 * year 2023
 */
package gzq.byd.com.luogu.P1006;

import java.util.Scanner;

public class PassPaper {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt(), n = scanner.nextInt();

        int[][] tab = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                tab[i][j] = scanner.nextInt();
            }
        }


    }

}
