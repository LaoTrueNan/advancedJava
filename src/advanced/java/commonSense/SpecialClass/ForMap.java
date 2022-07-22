package advanced.java.commonSense.SpecialClass;

import java.util.HashMap;
import java.util.Map;

public class ForMap<T> {


    private T[] data;
    private int size;
    private CustomFunctionalInterface<? super T> c;

    public ForMap(CustomFunctionalInterface<T> o) {
        c = o;
    }

    public void addItem(T n){
        data[++size] = n;
    }

    public T getOne(T t1){
        System.out.println(c);
        return (T) c.returnObj(t1,"t2");
    }
}
