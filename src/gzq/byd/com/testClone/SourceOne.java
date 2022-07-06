package gzq.byd.com.testClone;

@SuppressWarnings({"unused"})
public class SourceOne implements Cloneable{
    private String name;

    private String age;

    private String sophomore;

    private String senior;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSophomore() {
        return sophomore;
    }

    public void setSophomore(String sophomore) {
        this.sophomore = sophomore;
    }

    public String getSenior() {
        return senior;
    }

    public void setSenior(String senior) {
        this.senior = senior;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "SourceOne{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", sophomore='" + sophomore + '\'' +
                ", senior='" + senior + '\'' +
                '}';
    }
}
