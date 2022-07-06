package gzq.byd.com.annotation;

import sun.java2d.pipe.SpanClipRenderer;

import java.beans.ExceptionListener;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CallUse<T> {
    private Gzqiang gzqiang;

    public CallUse(Gzqiang gzqiang) {
        this.gzqiang = gzqiang;
    }

    public void getFields() {
        try {
//            Field name = this.gzqiang.getClass().getDeclaredField("name");
//            name.setAccessible(true);
            Method showw = this.gzqiang.getClass().getMethod("showw", String.class, String.class);
            showw.setAccessible(true);
            Parameter[] parameters = showw.getParameters();
            for(Parameter p : parameters){
                System.out.println(p.getAnnotation(Excel.class).value());
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

}
