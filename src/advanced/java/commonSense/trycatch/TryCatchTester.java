package advanced.java.commonSense.trycatch;

public class TryCatchTester {
    public static void main(String[] args) {
        System.out.println(test());//运行结果1,3,2
    }
    public static int test(){
        int a = 1;
        try {
            System.out.println(a);
            return ++a;
        } catch (Exception e) {
            System.out.println(a);
            return ++a;
        } finally {
            ++a;//finally中对于值类型的修改不起作用，这个a在finally中是3，但是返回的还是2
            System.out.println("finally");
            System.out.println(a);
        }
    }
}
