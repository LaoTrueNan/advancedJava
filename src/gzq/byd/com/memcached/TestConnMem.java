package gzq.byd.com.memcached;


import net.spy.memcached.MemcachedClient;
import net.spy.memcached.internal.OperationFuture;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.concurrent.ExecutionException;

/**
 * @author 4466184
 * @date 2022/8/24 11:42
 */

public class TestConnMem {
    public static void main(String[] args) throws IOException, ExecutionException, InterruptedException {
        InetSocketAddress cacheNet = new InetSocketAddress("127.0.0.1", 11211);

        MemcachedClient mcc = new MemcachedClient(cacheNet);
        OperationFuture<Boolean> set = mcc.set("gzq", 1000, "helloworld");
        System.out.println(set.get());

        mcc.shutdown();

    }
}
