/*
 * author guo
 * year 2023
 */
package gzq.byd.com.coll.list;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class TestList {

    public static void main(String[] args) {

        UnaryOperator<Integer> sqrPower = i -> i*i;

        UnaryOperator<Integer> plusTen = i -> i+=10;

        List<Integer> a = new ArrayList<>(8);

        List<Integer> integers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        String node = "filter";

        Predicate<Integer> filter = i->i>2;
        Predicate<Integer> filter2 = i->i<5;
        a.addAll(integers);
        // List<Integer> collect = a.stream().filter(filter.and(filter2)).collect(Collectors.toList());


        // 邻接表和hash表

        integers.removeIf(pre->pre>2);

        Consumer<Integer> consumer = System.out::println;

        integers.forEach(consumer);
    }
}
