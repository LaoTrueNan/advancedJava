package gzq.byd.com.enumeric;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD})
public @interface Excel2 {
    String value() default "helloworld";
}
