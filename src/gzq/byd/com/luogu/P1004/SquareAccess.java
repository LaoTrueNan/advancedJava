package gzq.byd.com.luogu.P1004;

import java.util.Scanner;

/**
 * @author 4466184
 * luogu P1004
 * @date 2022/11/16 14:28
 */

public class SquareAccess {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cnt = scanner.nextInt();
        //
        int[][] a = new int[cnt*cnt][3];
        int _cnt = 0;
        int size = 0;
        while(scanner.hasNext()){
            int tmp = scanner.nextInt();
            if(tmp==0){
                _cnt++;
            }
            if(_cnt==3){break;}
            a[size/3][size++%3] = tmp;
            if(size%3==0){
                _cnt = 0;
            }
        }
    }

}
