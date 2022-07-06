package gzq.byd.com.jedis;

import redis.clients.jedis.Jedis;

import java.util.List;
import java.util.Random;

public class JedisTest {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("localhost",6379);
//        jedis.lpush("b","hello");
        String b1 = jedis.lpop("b");
        System.out.println(b1);
//        jedis.lpush("b", String.valueOf(new Random().nextInt()));
        List<String> b = jedis.lrange("b", 0, -1);

        System.out.println(b);
    }
}
