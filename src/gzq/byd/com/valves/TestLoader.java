package gzq.byd.com.valves;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.net.URLClassLoader;
import java.net.URLStreamHandler;

/**
 * @author 4466184
 * @date 2022/8/8 8:34
 */

public class TestLoader {
    public static void main(String[] args) {
        try {
            final String root = System.getProperty("user.dir") + File.separator + "gzq";

            URL[] urls = new URL[1];
            URLStreamHandler urlStreamHandler = null;
            final File file = new File(root);
            final String path = new URL("file", null, file.getCanonicalPath() + File.separator).toString();
            urls[0] = new URL(null,path,urlStreamHandler);

            final URLClassLoader urlClassLoader = new URLClassLoader(urls);

            // must pass a binary name to loadClass
            final Class test = urlClassLoader.loadClass("gzq.byd.com.valves.Test");


            final Test test1 = (Test) test.newInstance();
            test1.hei();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

    }
}
