package gzq.byd.com.memcached.rabbitmq;

import com.alibaba.fastjson2.JSONObject;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.DeliverCallback;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

/**
 * @author 4466184
 * @date 2022/9/3 15:26
 */

public class Receiver {
    private final static String QUEUE_NAME="hello";

    public static void main(String[] args) throws IOException, TimeoutException {
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("localhost");
        Connection connection = factory.newConnection();
        Channel channel = connection.createChannel();
        channel.queueDeclare(QUEUE_NAME,false,false,false,null);

//        DeliverCallback deliverCallback = (consumerTag,delivery)->{
//            String message = new String(delivery.getBody(), "UTF-8");
//            System.out.println(message);
//        };
        DeliverCallback deliverCallback = (consumerTag,delivery)->{
            String message = new String(delivery.getBody(), "UTF-8");
            System.out.println(JSONObject.parseObject(message, Person.class));
            try{
                work(message);
            }catch (Exception e){
                e.printStackTrace();
            }finally {
                System.out.println(message+" done");
            }
        };
        channel.basicConsume(QUEUE_NAME,true,deliverCallback,a->{});
    }

    public static void work(String args) throws InterruptedException {
        for (char c : args.toCharArray()) {
            if(c == '.'){
                Thread.sleep(1000);
            }
        }
    }
}

class Person{
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
