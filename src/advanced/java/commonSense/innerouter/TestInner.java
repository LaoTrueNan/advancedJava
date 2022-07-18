package advanced.java.commonSense.innerouter;

public class TestInner {
    protected String name;

    public TestInner(String name) {
        this.name = name;
    }


    public void ccopeWith(){
        new TestInner.GInner().copeWith();
    }

    protected class GInner{
        public void copeWith(){
            System.out.println(TestInner.this);
        }
    }


    public static void main(String[] args) {
        TestInner outer = new TestInner("outer");
        outer.ccopeWith();
    }
}
