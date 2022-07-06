package gzq.byd.com.socket;


import org.springframework.web.context.request.RequestContextListener;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Map;

/**
 * create HttpRequest and HttpResponse objects
 */
@SuppressWarnings({"deprecation"})
public class HttpProcessor {

    private HttpRequestLine httpRequestLine = new HttpRequestLine();
    public void process(Socket socket){
        SocketInputStream is = null;
        OutputStream os = null;
        try {
            is = new SocketInputStream(socket.getInputStream(),2048);
            os = socket.getOutputStream();

        } catch (IOException e) {
            e.printStackTrace();
        }
        Request request =null;
        Response response = null;

        try {
            request = new Request(is);
            request.parse();
            response = new Response(os);
            response.setRequest(request);
            parseRequest(is,os);
            parseHeaders(is);

            if(request.getUri().startsWith("/servlet/")){
                ServletProcessor sp = new ServletProcessor();
                sp.process(request,response );
            }else{
                StaticResourceProcessor srp = new StaticResourceProcessor();
                srp.process(request,response);
            }
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

//    public String readRequestLine(){
//
//    }
//
//    public Map<String,String> readHeader(){
//
//    }

    private void parseRequest(SocketInputStream is, OutputStream os){
        try {
            is.readRequestLine(httpRequestLine);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void parseHeaders(SocketInputStream is){

    }
}
