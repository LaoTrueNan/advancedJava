package advanced.java.designPattern.factoryMethod;

public class SMSNotification implements Notification{
    @Override
    public void notifyUser() {
        System.out.println("notify users from SMS");
    }
}
