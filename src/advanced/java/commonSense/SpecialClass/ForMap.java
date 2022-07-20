package advanced.java.commonSense.SpecialClass;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForMap {

    private Map<String, CustomFunctionalInterface> singletonFactories = new HashMap<>(10);

    public void addItem(String beanName,CustomFunctionalInterface object){
        singletonFactories.put(beanName,object);
    }

    public Object getOne(){
        CustomFunctionalInterface fa = singletonFactories.get("first");
        return fa.returnObj();
    }
}
