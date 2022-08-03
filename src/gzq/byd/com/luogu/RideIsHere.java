package gzq.byd.com.luogu;

import java.util.Scanner;

public class RideIsHere {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String hxStr = new String();
        String gpStr = new String();
        hxStr = scanner.next();
        gpStr = scanner.next();
        byte[] hxStrBytes = hxStr.getBytes();
        byte[] groupBytes = gpStr.getBytes();
        int res1 = 1,res2 = 1;
        for (int i = 0; i < hxStrBytes.length; i++) {
            hxStrBytes[i]-=64;
            //95
            res1*=hxStrBytes[i];
            //142
        }
        for (int i = 0; i < groupBytes.length; i++) {
            groupBytes[i]-=64;
            res2*=groupBytes[i];
            //95
            //142
        }
//        65-90 97-122

        int i = res1 % 47;
        int j = res2 % 47;
        if(i==j){
            System.out.println("GO");
        }else{
            System.out.println("STAY");
        }
    }
}
