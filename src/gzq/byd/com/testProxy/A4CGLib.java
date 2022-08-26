package gzq.byd.com.testProxy;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Documented
public @interface A4CGLib {
    public String title() default "default title";
}
