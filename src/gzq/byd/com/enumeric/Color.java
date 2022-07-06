package gzq.byd.com.enumeric;

public enum Color {
    RED{
        @Override
        public String getInfo(){
            return "red";
        }
    },BLUE{
        @Override
        public String getInfo() {
            return "blue";
        }
    },BLACK{
        @Override
        public String getInfo() {
            return "black";
        }
    };
    private Color(){
        System.out.println(this.name());
    }

    public abstract String getInfo();
}
