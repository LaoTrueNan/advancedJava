package gzq.byd.com.testProxy;

import net.sf.cglib.proxy.Enhancer;

public class TestProxy {
    public static void main(String[] args) throws NoSuchMethodException {
        Vehicle car = new Vehicle();
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(car.getClass());
        enhancer.setCallback(new VehicleCGlibProxy());
        Vehicle proxy= (Vehicle)  enhancer.create();
        proxy.start();
        proxy.beep(10,2);
    }
}
