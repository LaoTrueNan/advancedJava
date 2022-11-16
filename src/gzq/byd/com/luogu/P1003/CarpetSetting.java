package gzq.byd.com.luogu.P1003;

import java.util.Scanner;

/**
 * @author 4466184
 * luogu set carpets
 * @date 2022/11/16 13:09
 */
// 10,000,000,000
public class CarpetSetting {

    // 先用按位与试试
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] b = new int[n][4];
        for(int i = 0 ;i < n; i++){
            for (int i1 = 0; i1 < 4; i1++) {
                b[i][i1] = scanner.nextInt();
            }

//            1 0 2 3 1-3,0-3
//            0 2 3 3 0-3,2-5
//            2 1 3 3 2-5,1-4
        }
        int i;
        int x = scanner.nextInt(),y = scanner.nextInt();
        for(i = n-1 ;i >= 0; i--){
            int left = b[i][0]+b[i][2];
            int right = b[i][1]+b[i][3];
            if(x>=b[i][0] && x<=left && y>=b[i][1] && y<=right){
                break;
            }
//            1 0 2 3 1-3,0-3
//            0 2 3 3 0-3,2-5
//            2 1 3 3 2-5,1-4
        }

        System.out.println(i>=0?i+1:i);

    }


}
