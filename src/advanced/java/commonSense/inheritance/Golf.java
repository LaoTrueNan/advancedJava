package advanced.java.commonSense.inheritance;

public class Golf extends Vehicle{
    public String name;

    public Golf(String name) {
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println(111);
    }

    public void showName(){
        System.out.println(this.name);
    }
}
