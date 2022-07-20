package advanced.java.commonSense.SpecialClass;

public class Norwich {
    private String name;
    private String population;
    private int order;

    public Norwich() {
        this("norwich","34million",1);
    }

    public Norwich(int o){
        this("norwich","34million",o);
    }

    public Norwich(String name, String population,int order) {
        this.name = name;
        this.population = population;
        this.order = order;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    @Override
    public String toString() {
        return "Norwich{" +
                "name='" + name + '\'' +
                ", population='" + population + '\'' +
                ", order=" + order +
                '}';
    }
}
