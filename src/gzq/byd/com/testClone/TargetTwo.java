package gzq.byd.com.testClone;

@SuppressWarnings({"unused"})
public class TargetTwo implements Cloneable{

    private String sophomore;

    private String name;

    public String getSophomore() {
        return sophomore;
    }

    public void setSophomore(String sophomore) {
        this.sophomore = sophomore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "TargetTwo{" +
                "sophomore='" + sophomore + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
