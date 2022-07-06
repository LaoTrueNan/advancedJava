package gzq.byd.com.testProxy;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class VehicleCGlibProxy implements MethodInterceptor {
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println(method.getName()+"proxied!");
        Object o1 = methodProxy.invokeSuper(o, objects);
        System.out.println(method.getName()+"executed!");
        return o1;
    }
}
