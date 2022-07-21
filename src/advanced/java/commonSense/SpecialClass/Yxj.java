package advanced.java.commonSense.SpecialClass;

import java.util.Comparator;

public class Yxj<T> {
    private T[] data;
    private int size = 0;
    private final Comparator<? super T> comparator;
    public Yxj(Comparator<? super T> c) {
        data= (T[]) new Object[16];
        comparator = c;
    }

    public void addItem(T t){
        data[size++] = t;
    }

    public int sort(){
        return comparator.compare(data[0], data[1]);
    }


    public  T[] getData(){
        return data;
    }
}
