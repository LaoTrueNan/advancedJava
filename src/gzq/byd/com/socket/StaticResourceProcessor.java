package gzq.byd.com.socket;

import java.io.IOException;

public class StaticResourceProcessor {

    public void process(Request req, Response resp){
        try {
            resp.sendStaticResource();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
