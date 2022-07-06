package gzq.byd.com.annotation;


@SuppressWarnings({"unused"})
public class Gzqiang extends Object{

    private String name;

    private String init;

    public Gzqiang() {
    }

    public Gzqiang(String name,String init) {
        this.name = name;
        this.init = init;
    }

    @Excel(value = "方法上的注解")
    public String getName() {
        return name;
    }

    public void setName(@Excel(value = "放在参数上") String name) {
        this.name = name;
    }

    public String getInit() {
        return init;
    }

    public void setInit(String init) {
        this.init = init;
    }

    public String showw(@Excel(value = "①参数注解") String name,@Excel(value = "②参数注解") String ahsdf){
        return name;
    }
    public String showw(){
        return "aaa";
    }

    @Override
    public String toString() {
        return "Gzqiang{" +
                "name='" + name + '\'' +
                ", init='" + init + '\'' +
                '}';
    }
}
