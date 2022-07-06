package advanced.java.designPattern.factoryMethod;

public class EmailNotification implements Notification{
    @Override
    public void notifyUser() {
        System.out.println("notify users from Email");
    }
}
