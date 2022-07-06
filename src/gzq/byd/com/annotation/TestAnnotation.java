package gzq.byd.com.annotation;

import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.*;

public class TestAnnotation {
    public static void main(String[] args) {
        Gzqiang gzqiang = new Gzqiang("第一个参数", "第二个参数");
        CallUse<Gzqiang> callUse = new CallUse<>(gzqiang);
        callUse.getFields();
    }
}
