package decoratorPattern;

/**
 * @author : wuyuwu@shuidihuzhu.com
 * @Date : 2019/3/17 上午11:14
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}
