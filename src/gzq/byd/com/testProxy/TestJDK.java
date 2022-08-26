package gzq.byd.com.testProxy;

/**
 * @author 4466184
 * @date 2022/8/24 11:32
 */

public class TestJDK {
    public static void main(String[] args) {
        Car carProxy = VehicleProxy.getCarProxy(new Vehicle());
        System.out.println(carProxy.getClass().getName());
        carProxy.beep(10,2);
        carProxy.start();
    }
}
