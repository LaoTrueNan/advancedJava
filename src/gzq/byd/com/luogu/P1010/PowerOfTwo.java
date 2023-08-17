/*
 * author guo
 * year 2023
 */
package gzq.byd.com.luogu.P1010;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int target = scanner.nextInt();

        List<Integer> tabs = new ArrayList<>(15);
        int step = 0;
        while(target!=0){
            if(target%2==1){
                tabs.add(step);
            }
            target = target >> 1;
            step++;
        }
        // use stack for tabulation
        List<Integer> result = tabs.stream().sorted((a,b)->b-a).collect(Collectors.toList());
        for (Integer integer : result) {
            System.out.println(2+"("+integer+")");
        }

//        10001001
    }
}
