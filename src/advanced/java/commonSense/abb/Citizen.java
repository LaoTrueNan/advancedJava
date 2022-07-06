package advanced.java.commonSense.abb;

public class Citizen extends Person{
    private String name;

    public Citizen(String name) {
        this.name = name;
    }

    public Citizen(String name, String name1) {
        super(name);
        this.name = name1;
    }

    public void showName(){
        System.out.println(this.name);
    }
}
