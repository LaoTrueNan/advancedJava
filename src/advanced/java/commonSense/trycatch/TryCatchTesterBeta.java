package advanced.java.commonSense.trycatch;

import java.util.Arrays;

public class TryCatchTesterBeta {
    public static void main(String[] args) {
        System.out.println(test());
        System.out.println(Arrays.toString(testQuote()));
    }

    public static String test() {
        String a = "init";

        try {
            System.out.println(a);

            a=a+" append body";
            return a;
        } catch (Exception e) {
            a=a+" append catch";
            return a;
        } finally {
            a=a+" append finally";
            System.out.println("finally "+a);
        }
    }

    public static int[] testQuote(){
        int[] b = new int[]{0};
        try {
            System.out.println(Arrays.toString(b));
            return b;
        } catch (Exception e) {
            e.printStackTrace();
            return b;
        } finally {
            b[0]=3;
            System.out.println(Arrays.toString(b));
        }
    }
}
