package advanced.java.designPattern.factoryMethod;

public class PushNotification implements Notification{
    @Override
    public void notifyUser() {
        System.out.println("notify users from Push");
    }
}
