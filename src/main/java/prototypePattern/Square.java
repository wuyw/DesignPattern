package prototypePattern;

/**
 * @author : wuyuwu@shuidihuzhu.com
 * @Date : 2019/3/10 下午4:17
 */
public class Square extends Shape {
    public Square(){
        type = "Square";
    }

    @Override
    void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
