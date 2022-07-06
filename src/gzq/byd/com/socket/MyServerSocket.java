package gzq.byd.com.socket;

import org.apache.catalina.util.StringManager;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

@Deprecated
public class MyServerSocket {
    private static final String SHUTDOWN_COMMAND = "/SHUTDOWN";

    public static final String WEB_ROOT=System.getProperty("user.dir")+ File.separator+"webroot";

    public static void main(String[] args) {
        MyServerSocket myServerSocket = new MyServerSocket();
        myServerSocket.await();


    }

    private boolean shutdown = false;
    public void await(){
        ServerSocket serverSocket = null;
        StringManager manager = StringManager.getManager("gzq.byd.com.socket");
        int port = 8765;
        try {
            serverSocket = new ServerSocket(port, 1, InetAddress.getByName("127.0.0.1"));
            System.out.println(manager.getString("httpConnector.alreadyInitialized"));
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(-1);
        }

        while(!shutdown){
            Socket accept = null;
            InputStream is = null;
            OutputStream os = null;
            try {
                accept = serverSocket.accept();
                is = accept.getInputStream();
                os = accept.getOutputStream();
                // the task of creating request and response instances have been assigned to HttpProcessor
                Request request = new Request(is);
                request.parse();
                Response response = new Response(os);
                response.setRequest(request);
                if(request.getUri().startsWith("/servlet/")){
                    ServletProcessor sp = new ServletProcessor();
                    sp.process(request,response );
                }else{
                    StaticResourceProcessor srp = new StaticResourceProcessor();
                    srp.process(request,response);
                }
                accept.close();
                shutdown=request.getUri().equalsIgnoreCase(SHUTDOWN_COMMAND);
            } catch (IOException e) {
                e.printStackTrace();
                continue;
            }
        }
        System.out.println(manager.getString("httpConnector.alreadyDestroyed"));
    }
}
