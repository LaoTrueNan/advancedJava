package gzq.byd.com.enumeric;

public class EnumApplication {
    public static void main(String[] args) {
        System.out.println("all the constructors of the enumeration will be invoked once");
        Color a = Color.BLACK;
        System.out.println(a.getInfo());

        String sr = "already";
        System.out.println(sr.substring(2,4));

        byte[] aa = new byte[1024];
        System.out.println(aa.getClass());
    }
}
