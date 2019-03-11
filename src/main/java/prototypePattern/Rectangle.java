package prototypePattern;

/**
 * @author : wuyuwu@shuidihuzhu.com
 * @Date : 2019/3/10 下午4:16
 */
public class Rectangle extends Shape {
    public Rectangle(){
        type = "Rectangle";
    }

    @Override
    void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
