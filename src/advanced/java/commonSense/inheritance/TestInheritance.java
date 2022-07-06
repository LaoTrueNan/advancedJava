package advanced.java.commonSense.inheritance;

import org.openjdk.jol.info.ClassLayout;

public class TestInheritance {
    public static void main(String[] args) {
        Vehicle v =new Golf("a");
        v.showName();
        v.eat();
        System.out.println(ClassLayout.parseInstance(v).toPrintable());
        //下转型的子类方法就是子类的内容，直接访问属性还是父类自己的
        //Vehicle v =new Golf("a");
        System.out.println(v.name);
        System.out.println(v.getClass());
    }
}
