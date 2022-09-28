package gzq.byd.com.memcached.rabbitmq;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.TimeoutException;

/**
 * @author 4466184
 * @date 2022/9/3 15:19
 */

public class Sender {
    private final static String QUEUE_NAME = "hello";

    public static void main(String[] args) {
        ConnectionFactory fa = new ConnectionFactory();
        fa.setHost("localhost");

        try (Connection connection = fa.newConnection();
             Channel channel = connection.createChannel();){
            channel.queueDeclare(QUEUE_NAME,false,false,false,null);
            String message = String.join(" ",args);
            channel.basicPublish("",QUEUE_NAME,null,message.getBytes(StandardCharsets.UTF_8));
            System.out.println(message+ " sent");
        } catch (IOException | TimeoutException e) {
            e.printStackTrace();
        }
    }
}
