package abstractFactoryPattern;

/**
 * @author : wuyuwu@shuidihuzhu.com
 * @Date : 2019/3/8 上午9:44
 *
 * 抽象工厂模式：
 * 围绕一个超级工厂创建其他工厂，该超级工厂又称为其他工厂的工厂，
 * 超级工厂只能同时使用一个工厂
 *
 * 应用场景：
 * 系统的产品又多于一个的产品族，而系统只消费其中的某一族的产品
 *
 * 优缺点：
 *
 * 优点：当一个产品族中的多个对象被设计成一起工作时，它能保证客户端始终只使用同一个产品族中的对象
 * 缺点：产品族扩展很困难，要增加一个系列的某一产品，既要在抽象的 Creator 里加代码，又要在具体的里面加代码。
 *
 */
public class AbstractFactoryPattern {

    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();

        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
        Color color1 = colorFactory.getColor("RED");
        color1.fill();
    }
}