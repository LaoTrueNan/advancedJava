package advanced.java.commonSense.JUL15Inheritance;

public abstract class ContainerBase implements Container{


    public abstract boolean check();

    @Override
    public void poop() {
        if(check()){
            System.out.println("poop from super class");
        }else{
            System.out.println("no eating no pooping");
        }
    }
}
