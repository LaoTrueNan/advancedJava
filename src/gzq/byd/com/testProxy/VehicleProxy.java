package gzq.byd.com.testProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class VehicleProxy {
    public static Car getCarProxy(Car car){
        Object o = Proxy.newProxyInstance(car.getClass().getClassLoader(), car.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println(method.getName() + " invoked!");
                Object result = method.invoke(car, args);
                System.out.println(method.getName() + " ended!Result is :"+result);
                if(args!=null){
                    System.out.println(method.getName() + "'s args are like following :" + Arrays.asList(args));
                }
                return result;
            }
        });
        return (Car) o;
    }
}
