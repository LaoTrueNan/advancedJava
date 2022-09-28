package gzq.byd.com.ItfAndAbs;

/**
 * @author 4466184
 * @date 2022/9/22 16:01
 */
//It is a total abstraction, All methods declared within an interface must be implemented by the class(es) that implements this interface.
//A class can implement more than one interface. It is called multiple inheritances.
//You want to specify the behavior of a particular data type but are not concerned about who implements its behavior.
public interface _Shape {
    void draw();
    double area();
}
