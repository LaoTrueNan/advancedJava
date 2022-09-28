package gzq.byd.com.mthread;

public class TestMThread {
    public static void main(String[] args) {
        String a = "mxCell#1";

        int itsId = Integer.parseInt(a.substring(a.indexOf("mxCell#") + 7));

        System.out.println(itsId);

    }
}
