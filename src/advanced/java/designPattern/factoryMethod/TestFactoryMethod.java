package advanced.java.designPattern.factoryMethod;

public class TestFactoryMethod {
    public static void main(String[] args) {
        try {
            Notification sms = NotificationFactory.generateNotification(NotificationFactory.NotificationType.PUSH);
            sms.notifyUser();
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }

    }
}
