/*
 * author guo
 * year 2023
 */
package gzq.byd.com.temp;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexOr {
    public static void main(String[] args) {
        Pattern compile = Pattern.compile("(asdf)");
        String s = "(* asdf*)  asdf";
        Matcher jin = compile.matcher(s);
        Set<String> tabs = new HashSet<String>();
        while(jin.find()){
            String group = jin.group(1);
            System.out.println(group);
            tabs.add(group);
        }
        for (String tab : tabs) {
            System.out.println(tab);
            s = s.replaceAll("(?<!\\(\\*\\s*)("+tab+")"," \\$$1\\$");
        }
        System.out.println(s);
    }
}
