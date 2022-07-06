package advanced.java.threads;

public class RThread{
    public static void main(String[] args) {
        String a = "http://www.baidu.com/index?aaa=b;jsessionid=1897ikajshdkjfh";
        int i = a.indexOf("://");
        int i1 = a.indexOf("/", i+3);
        String substring = a.substring(i1);
        int i2 = substring.indexOf(";jsessionid=");

        String substring1 = substring.substring(i2 + ";jsessionid=".length());
        System.out.println(substring1);

        String b = "abcde";
        System.out.println(b.substring(0,2));

        int c = 61;
        System.out.printf("%c",c);

    }
}
