package advanced.java.commonSense.jol;

import org.openjdk.jol.info.ClassLayout;

class Person {
    private BodyParams bp;
    private BodyParams bcp;
    private boolean p;
    private boolean s;
}

public class TestJol {
    public static void main(String[] args) {
        Person person = new Person();
//        Person personb = new Person();
//        Person personc = new Person();
        Person a = person;
        System.out.println(ClassLayout.parseInstance(person).toPrintable());
        System.out.println(ClassLayout.parseInstance(a).toPrintable());
//        Person[] ps = new Person[3];
//        ps[0] = person;
//        ps[1] = personb;
//        ps[2] = personb;
//        System.out.println(ClassLayout.parseInstance(ps).toPrintable());
    }
}
