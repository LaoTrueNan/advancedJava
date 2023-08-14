/*
 * author guo
 * year 2023
 */
package gzq.byd.com.graph;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 洛谷P1359 租用游艇 有点像货车运输LeetCode
 * s0 利用过河卒的思路
 */
public class HelloGraph {

    // 递归
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        if(n==1 || n==2){
//            System.out.println(scanner.nextInt());
//        }else{
//            int [][] tab = new int[n][n];
//            for (int i = 0; i < n; i++) {
//                for (int j = i+1; j < n ; j++) {
//                    tab[i][j] = scanner.nextInt();
//                }
//            }
//            // after I drew a matrix
//            for (int i = 3; i <= n; i++) {
//                for (int j = 2; j <= i - 1; j++) {
//                    if(tab[0][j-1] + tab[j-1][i-1] < tab[0][i-1]){
//                        tab[0][i-1] = tab[0][j-1] + tab[j-1][i-1];
//                    }
//                }
//            }
//            System.out.println(tab[0][n-1]);
//        }
//
        String a = "[{\"id\":0,\"label\":\"这12 是中 _a文测试\",\"and\":[{\"变量1\":\"aj d啊\"}],\"=\":{\"变量2\":10048}},{\"id\":0,\"label\":\"这12 是中 _a文测试\",\"and\":[{\"变量1\":\"aj d啊\"}],\"=\":{\"变量2\":10048}}]";
        List<String> collect = Arrays.stream(a.split("(?<=\")|(?=\")")).collect(Collectors.toList());
        List<String> result = new ArrayList<>(collect.size());
        boolean inLabel = false;
        Deque<String> stack = new ArrayDeque<>();
        for (String s : collect) {
            if(s.matches("^\"$")){
                // 栈中只有一个引号,那现在这个就是与其匹配的反引号
                if(stack.size()==1&&!inLabel){
                    stack.pollLast();
                }
                // 栈中有3个引号并且'label'标识为true,那说明label区域结束,bug:label中万一有引号就提前结束
                else if(stack.size()==3&&inLabel){
                    stack.clear();
                    inLabel = false;
                }else{
                    stack.addLast(s);
                }
            }else if(s.matches("(?i)^label$")){
                inLabel = true;
            }else if(s.matches("[\\u4e00-\\u9fa5\\w\\d_]*[\\u4e00-\\u9fa5][\\u4e00-\\u9fa5\\w\\d_]*")){
                if(!inLabel){
                    s = s.replaceAll("([\\u4e00-\\u9fa5\\w\\d_]*[\\u4e00-\\u9fa5][\\u4e00-\\u9fa5\\w\\d_]*)","\\$$1\\$");
                }
            }
            result.add(s);
        }

        System.out.println(result.stream().collect(Collectors.joining()));
//        Stack<String> quotationMarkStack = new Stack<>();
//        boolean inQuote = false,inLabel = false;
//        for (String s : collect) {
//            if(s.equals("\"")){
//                if(quotationMarkStack.size()==1){
//                    quotationMarkStack.pop();
//                    inQuote = false;
//                }else{
//                    quotationMarkStack.push(s);
//                    inQuote = true;
//                }
//            }else if(s.equalsIgnoreCase("label")){
//                inLabel = inQuote;
//            }
//        }
//        String pattern = "(?<!label\":)(\"?)([\\u4e00-\\u9fa5\\w\\d_]*[\\u4e00-\\u9fa5][\\u4e00-\\u9fa5\\w\\d_]*)(\"?\\s*)";
//        System.out.println(a.replaceAll(pattern, "$1\\$$2\\$$3"));
    }
}
