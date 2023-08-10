/*
 * author guo
 * year 2023
 */
package gzq.byd.com.graph;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
//
//        Scanner scanner = new Scanner(System.in);
//        String a = scanner.nextLine();
//
//        Pattern compile = Pattern.compile("^([\\w\\d]+).([\\w\\d]+)@([\\w\\d]+).com$");
//        Matcher matcher = compile.matcher(a);
//
//        while(matcher.find()){
//            System.out.println("用户名是"+matcher.group(1)+"."+matcher.group(2));
//            System.out.println("注册的网站是"+matcher.group(3));
//        }

        String pattern = "(\"?|type)\\s*([\\u4e00-\\u9fa5\\w\\d_]*[\\u4e00-\\u9fa5][\\u4e00-\\u9fa5\\w\\d_]*)\"?\\s*:\\s*(struct|\\(|\"?[\\[{\"\\u4e00-\\u9fa5\\w\\d_]+[\"\\]},]|[^=][\\[.\\w\\d\\s\\]]*;)";
//        String pattern = "(\"?([\\u4e00-\\u9fa5\\w\\d_]+)\"?\\s*:\\s*[^=].*;)|(\"?([\\u4e00-\\u9fa5\\w\\d_]+)\"?\\s*:\\s*\"?[\\u4e00-\\u9fa5\\w\\d_]+[\"\\]},])";
        Pattern compile = Pattern.compile(pattern,Pattern.CASE_INSENSITIVE);
        String a ="(*  结构体 *)\n" +
                "TYPE 结构体:\n" +
                "    STRUCT\n" +
                "       s1 : BOOL;\n" +
                "       s2 : BOOL;\n" +
                "    END_STRUCT;\n" +
                "END_TYPE\n" +
                "(* 结构体 *)\n" +
                "TYPE struct1:\n" +
                "    STRUCT\n" +
                "       g1 : BOOL;\n" +
                "       g2 : BOOL;\n" +
                "    END_STRUCT;\n" +
                "END_TYPE\n" +
                "(* 数据类型重定义 *)\n" +
                "[{\"id\":0,\"label\":\"\",\"and\":[{\"变量1\":10047}],\"=\":{\"变量2\":10048}}]" +
                "TYPE ewww : INT;\n" +
                "END_TYPE\n" +
                "(* 数据类型重定义 *)\n" +
                "TYPE 中文重定义ada : INT;\n" +
                "END_TYPE\n" +
                "(* 枚举量 *)\n" +
                "TYPE 枚举中English夹杂77:\n" +
                "(\n" +
                "   n1,\n" +
                "   n2\n" +
                ");\n" +
                "END_TYPE\n" +
                "(* 枚举量 *)\n" +
                "TYPE 枚举体中文测试:\n" +
                "(\n" +
                "   c1,\n" +
                "   中文枚举\n" +
                ");\n" +
                "END_TYPE\n" +
                "{#include \"INLINE_ST.st\"}\n" +
                "{#include \"FUNC_ST.st\"}\n" +
                "{#include \"FUNC_LD.st\"}\n" +
                "{#include \"FB_ST.st\"}\n" +
                "{#include \"FB_LD.st\"}\n" +
                "{#include \"PRG_ST.st\"}\n" +
                "{#include \"PRG_LD.st\"}\n" +
                "(* 运行配置 *)\n" +
                "CONFIGURATION STD_CONF\n" +
                "(* 共享变量引用 *)\n" +
                "VAR_GLOBAL\n" +
                "   全局0 : BOOL;\n" +
                "   全局1 : BOOL;\n" +
                "END_VAR\n" +
                "  RESOURCE STD_RESSOURCE ON PLC\n" +
                "(* 全局变量声明 *)\n" +
                "VAR_GLOBAL\n" +
                "   global0 : BOOL;\n" +
                "   global1 : BOOL;\n" +
                "END_VAR\n" +
                "    Task PrimaryTask(INTERVAL:= T#1s,PRIORITY :=1);\n" +
                "    PROGRAM INST_program_LD WITH PrimaryTask : program_LD;\n" +
                "    PROGRAM INST_program_ST WITH PrimaryTask : program_ST;\n" +
                "    Task PrimaryTask1(INTERVAL:= T#1s,PRIORITY :=1);\n" +
                "    PROGRAM INST_program_LD WITH PrimaryTask1 : program_LD;\n" +
                "    PROGRAM INST_program_ST WITH PrimaryTask1 : program_ST;\n" +
                "  END_RESOURCE\n" +
                "END_CONFIGURATION\n";

//        String a = "(* 程序 *)\n" +
//                "PROGRAM program_LD\n" +
//                "VAR\n" +
//                "  _EX_ENABLE  : BOOL ;\n" +
//                "  _EX_FORINDEX  : DINT ;\n" +
//                "END_VAR\n" +
//                "VAR\n" +
//                "\t变量1  : ARRAY[1..10] OF BOOL ;\n" +
//                "\t变量2  : ARRAY[1..10] OF BOOL ;\n" +
//                "END_VAR\n" +
//                "  <g0j0j1g4i9c3d8g8i5a1>\n" +
//                "  (*program_LD*)\n" +
//                "END_PROGRAM";
        Matcher matcher = compile.matcher(a);
        Set<String> tabs = new HashSet<>();
        while(matcher.find()){
            String var = matcher.group(2);
            tabs.add(var);
        }
        for (String var : tabs) {
            a = a.replace(var,"$"+var+"$");

        }
        System.out.println(a);
    }
}
