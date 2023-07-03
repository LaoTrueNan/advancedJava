package gzq.byd.com.kmp;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

public class KMPApplication {
    public static void swi(Integer a,Integer b){
        int c = a;
        a = b;
        b = c;
    }

    public static void sti(Integer a,Integer b){
        a = a^b;
        b = a^b;
        a = a^b;
    }
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String t = scanner.nextLine();
//        String t1 = scanner.nextLine();
//
//
//        KMP kmp = new KMP(t1, t);
//        System.out.println(kmp.res());


//        Scanner scanner = new Scanner(System.in);
//        int i = scanner.nextInt();
//        ArrayDeque<Integer> a = new ArrayDeque<>();
//        int s=0,t=1;
//        a.offer(t);
//        a.offer(t);
//        for(int j = 0;j<i;j++){
//            a.offer(0);
//            for (int k = 0; k <= j + 2; k++) {
//                t=a.pop();
//                int temp = s+t;
//                a.offer(temp);
//                s=t;
//                if(k!=j+2){
//                    System.out.printf("%d\t",s);
//                }
//            }
//            System.out.println();
//        }

        int a = 7,b=45;

        long start = System.currentTimeMillis();

        for (int i = 0; i < 1000; i++) {
            swi(a,b);
        }

        long elapsed = System.currentTimeMillis() - start;
        System.out.println(elapsed);


        long startu = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            sti(a,b);
        }

        long elapsedu = System.currentTimeMillis() - startu;
        System.out.println(elapsedu);

//        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
//        for (int i = 0; i < stackTrace.length; i++) {
//            System.out.println(stackTrace[i]);
//        }


//        char[] chars = t.toCharArray();
//        int[] next = new int[chars.length];
//        next[0] = 0;
//        for(int i=1,j=0;i<chars.length&&j<chars.length;j++){
//            if(chars[i]==chars[j]){j++;}
//            else{
//                next[i]++;
//            }
//        }
//
//        System.out.println(t);


    }
}
