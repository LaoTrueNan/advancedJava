package gzq.byd.com.InvacationHandler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class Hahah {
    public static Calculator getProxy(Calculator calculator) {
        InvocationHandler invocationHandler = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println(method.getName()+"---"+ Arrays.asList(args));
                return method.invoke(calculator,args);
            }
        };
        return (Calculator) Proxy.newProxyInstance(calculator.getClass().getClassLoader(), calculator.getClass().getInterfaces(),invocationHandler);
    }

}
