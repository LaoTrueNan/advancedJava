package advanced.java.commonSense.inheritance;

public abstract class Vehicle {
    public String name;

    public Vehicle() {
    }

    public static String showResult(){
        return "Vehicle";
    }
    public Vehicle(String name) {
        this.name = name;
    }

    public abstract void eat();

    public void showName(){
        System.out.println(this.name);
    }
}
