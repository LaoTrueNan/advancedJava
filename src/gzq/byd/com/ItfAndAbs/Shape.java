package gzq.byd.com.ItfAndAbs;

/**
 * @author 4466184
 * @date 2022/9/22 16:00
 */
//Consider using abstract classes if any of these statements apply to your situation:
//In the java application, there are some related classes that need to share some lines of code then you can put these lines of code within the abstract class and this abstract class should be extended by all these related classes.
//You can define the non-static or non-final field(s) in the abstract class so that via a method you can access and modify the state of the object to which they belong.
//You can expect that the classes that extend an abstract class have many common methods or fields, or require access modifiers other than public (such as protected and private).
public abstract class Shape {
    private String name;

    public Shape(String name) {
        this.name = name;
    }

    public abstract void draw();
    public abstract double area();
}
