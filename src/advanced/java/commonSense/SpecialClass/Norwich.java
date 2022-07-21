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
        if (order > n.getOrder()) {
            return 2;
        } else if (order == n.getOrder()) {
            return 0;
        } else {
            return -3;
        }
    }
}