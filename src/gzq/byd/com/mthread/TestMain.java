package gzq.byd.com.mthread;

import java.lang.reflect.InvocationTargetException;

public class TestMain {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        TestMThread testMThread = new TestMThread();
        for (int i = 0; i < 500; i++) {
            Object main = testMThread.getClass().getMethod("main", String[].class).invoke(null, (Object) new String[]{"123", "456"});
            System.out.println(main+"-----"+i);
        }
    }
}
