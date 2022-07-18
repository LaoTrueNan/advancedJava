package advanced.java.commonSense.JUL15Inheritance;

public class ConcreteContainer extends ContainerBase{

    private boolean eaten = false;

    @Override
    public boolean check() {
        return eaten;
    }

    @Override
    public void eat() {
        eaten = true;
        System.out.println("eat from concrete");
    }
}
