package advanced.java.commonSense.abb;

public abstract class Person {
    private String name;

    public Person() {
        this("Person");
    }

    public Person(String name) {
        this.name = name;
    }

    public abstract void showName();
}
