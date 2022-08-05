package gzq.byd.com.testNullPointer;

public class TestApplication {

    public static void main(String[] args) {
//        Student student = new Student();
//        student.setName(null);
//        if(student.getName().equals("123")){
//            System.out.println("success");
//        }1
        String a = "/SSM/helloworld";
        System.out.println(a.substring(3));
    }


}
class Student{

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}