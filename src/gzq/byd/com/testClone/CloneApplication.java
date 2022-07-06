package gzq.byd.com.testClone;

public class CloneApplication {
    public static void main(String[] args) throws CloneNotSupportedException {
        SourceOne sourceOne = new SourceOne();
        sourceOne.setAge("sage");
        sourceOne.setName("sname");
        sourceOne.setSophomore("ssophomore");
        sourceOne.setSenior("ssenior");
        TargetTwo clone = (TargetTwo) sourceOne.clone();
        System.out.println(clone);
    }
}
