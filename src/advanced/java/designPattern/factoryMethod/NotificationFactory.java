package advanced.java.designPattern.factoryMethod;

public class NotificationFactory {
    /**
     * create notification based on the string that user wants
     * @param name name of the notification type,'SMS','Email','Push' are available
     * @return notification type
     */
    protected static Notification generateNotification(NotificationType name){
        switch (name){
            case SMS:
                return new SMSNotification();
            case PUSH:
                return new PushNotification();
            case EMAIL:
                return new EmailNotification();
            default:
                throw new NullPointerException("can not instantiate notification with name "+name);
        }
    }
    enum NotificationType{
        SMS,EMAIL,PUSH
    }
}
