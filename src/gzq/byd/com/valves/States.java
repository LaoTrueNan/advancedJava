package gzq.byd.com.valves;

/**
 * @author 4466184
 * @date 2022/8/4 11:16
 */

public class States {
    private String[] states = {"AK","AL"};
    public String[] getStates(){
        return states;
    }
    public void showAll(){
        for (String state : states) {
            System.out.println(state);
        }
    }
}
