package abstractFactoryPattern;

/**
 * @author : wuyuwu@shuidihuzhu.com
 * @Date : 2019/3/8 上午10:05
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
