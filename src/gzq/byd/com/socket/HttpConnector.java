package gzq.byd.com.socket;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * waiting for HTTP requests
 */
public class HttpConnector implements Runnable{


    private String scheme = "http";
    private boolean stopped;

    @Override
    public void run() {
        ServerSocket server = null;
        int port = 8765;
        try{
            server = new ServerSocket(port,1, InetAddress.getByName("127.0.0.1"));
        }catch (IOException e){
            e.printStackTrace();
            System.out.println(e.getMessage());
            System.exit(-1);
        }

        while(!stopped){
            Socket socket = null;
            try{
                socket = server.accept();
            }catch (IOException e){
                e.printStackTrace();
                continue;
            }
            HttpProcessor processor = new HttpProcessor();
            processor.process(socket);
        }
    }

    public void start(){
        Thread thread = new Thread(this);
        thread.start();
    }
}
