package advanced.java.commonSense.SpecialClass;

public class Norwich {
    private int order;


    public Norwich(int o) {
        order = o;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }


    public int compareOrder(Norwich n) {
        return getOrder()-n.getOrder();
    }

    public Norwich getANorwich(String m){
        return this;
    }

    @Override
    public String toString() {
        return getClass().getName()+order;
    }
}