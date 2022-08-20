package advanced.java.commonSense.Aug16thBifunciton;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.IntBinaryOperator;

/**
 * @author 4466184
 * @date 2022/8/16 11:15
 */

public class Container {
    private Map<String, IntBinaryOperator> map = new HashMap<>();


    public void addOperator(BiFunction<Integer,Integer,Integer> mul){
        map.put("h", mul::apply);
    }


    public IntBinaryOperator fetchOperator(){
        return map.get("h");
    }


    public static void main(String[] args) {
        Container container = new Container();
        container.addOperator((a,b) -> a*b);

        IntBinaryOperator intBinaryOperator = container.fetchOperator();
        int i = intBinaryOperator.applyAsInt(5, 6);
        System.out.println(i);
    }
}
