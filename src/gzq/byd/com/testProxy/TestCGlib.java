package gzq.byd.com.testProxy;

import net.sf.cglib.proxy.Enhancer;

public class TestCGlib {
    public static void main(String[] args) throws NoSuchMethodException {
        Vehicle car = new Vehicle();
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(car.getClass());
        //设置方法拦截对象
        enhancer.setCallback(new VehicleCGlibProxy(car));

        Vehicle proxy= (Vehicle)  enhancer.create();
        System.out.println(proxy.getClass().getName());
//        System.out.println(proxy);
        proxy.start();
        proxy.beep(10,2);
    }
}
