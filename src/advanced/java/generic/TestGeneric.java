/*
 * author guo
 * year 2023
 */
package advanced.java.generic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class TestGeneric<T>{


    public static void main(String[] args) {
        List<String> strings = new ArrayList<>(3);
        strings.add("hello");
        strings.add("\n");
        strings.add("world");
        for (String string : strings) {
            if(string.matches("(?i)^hello$")){
                string = "%"+string+"%";
            }
        }
        String collect = strings.stream().collect(Collectors.joining());
        System.out.println(collect);
    }

}
