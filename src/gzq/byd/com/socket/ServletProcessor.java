package gzq.byd.com.socket;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.net.URLClassLoader;
import java.net.URLStreamHandler;

public class ServletProcessor {

    public void process(Request req, Response resp){
        String uri = req.getUri();
        String servletName = uri.substring(uri.lastIndexOf("/") + 1);
        // load a servlet via class loader
        URLClassLoader urlClassLoader = null;
        try {
            URL[] urls = new URL[1];
            URLStreamHandler streamHandler = null;
            File path = new File(MyServerSocket.WEB_ROOT);
            String repository = new URL("file", null, path.getCanonicalPath() + File.separator).toString();
            urls[0]=new URL(null,repository,streamHandler);
            urlClassLoader=new URLClassLoader(urls);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


        Class servlet = null;
        try {
            servlet = urlClassLoader.loadClass(servletName);
        } catch (ClassNotFoundException e) {
            try {
                resp.getWriter().write(e.getMessage());
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }

        Servlet servlet1 = null;

        try {
            servlet1=(Servlet) servlet.newInstance();
            servlet1.service(req, resp);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
