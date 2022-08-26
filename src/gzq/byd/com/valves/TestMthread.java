package gzq.byd.com.valves;

/**
 * @author 4466184
 * @date 2022/8/4 11:17
 */

public class TestMthread {
    public static void main(String[] args) {
        States states = new States();
        String[] as = states.getStates();
        as[0]="xiugai";
        states.showAll();
    }
}
