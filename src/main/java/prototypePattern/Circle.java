package prototypePattern;

/**
 * @author : wuyuwu@shuidihuzhu.com
 * @Date : 2019/3/10 下午4:18
 */
public class Circle extends Shape {

    public Circle(){
        type = "Circle";
    }

    @Override
    void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
