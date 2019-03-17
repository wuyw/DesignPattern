package decoratorPattern;

/**
 * @author : wuyuwu@shuidihuzhu.com
 * @Date : 2019/3/17 上午11:04
 * 装饰器模式：
 * 允许向以恶搞现有的对象添加新的功能，同时又不改变其结构，这种设计模式属于结构性的模式，它是作为现有类的一个包装
 *
 * 使用场景：
 *
 *
 * 优缺点：
 * 优点：装饰类和被装饰类可以独立发展，不会相互耦合，装饰模式是继承的一个替代模式，装饰模式可以动态扩展一个实现类的功能
 * 缺点：多层装饰比较复杂。
 *
 */
public class DecoratorPattern {
    public static void main(String[] args) {
        Shape circle = new Circle();

        Shape redCircle = new RedShapeDecorator(new Circle());

        Shape redRectangle = new RedShapeDecorator(new Rectangle());
        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();
    }
}
