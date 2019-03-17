package decoratorPattern;

/**
 * @author : wuyuwu@shuidihuzhu.com
 * @Date : 2019/3/17 上午11:22
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }
}
