package factoryPattern;

/**
 * @author : wuyuwu@shuidihuzhu.com
 * @Date : 2019/3/7 下午3:52
 *
 * 工厂模式：
 * 定义一个创建对象的接口，让其子类决定是实例化哪一个工厂模式，工厂模式使其创建过程延迟到子类进行
 * 主要解决接口选择问题
 *
 * 应用场景：
 * 1、日志记录器，记录可以记录到本地磁盘，系统事件，远程服务器等
 * 2、数据库访问，可以访问多种数据库，不同的数据库需要加载不同的驱动
 * 3、链接服务器的框架需要三个协议，"POP3"、"IMAP"、"HTTP"，可以把这三个作为产品类，共同实现一个接口。
 *
 * 优缺点：
 * 1、优点：一个调用者，只需要知道其名称就可以了，扩展性比较高，只需要扩展一个工厂类就可以，屏蔽产品的具体实现，使用者只关心接口
 * 2、缺点：每增加一个产品就需要增加一个具体的类和对象实现工厂，在大规模的系统中不宜使用
 */

public class FactoryPattern {

    public Shape getShape(String shape){
        if (shape.equals("Rectangle")){
            return new Rectangle();
        }else if (shape.equals("Circle")){
            return new Circle();
        }else if (shape.equals("Square")){
            return new Square();
        }

        return null;
    }

    public static void main(String[] args) {
        FactoryPattern factoryPattern = new FactoryPattern();
        Shape shape1 = factoryPattern.getShape("Rectangle");
        shape1.draw();

        Shape shape2 = factoryPattern.getShape("Circle");
        shape2.draw();

        Shape shape3 = factoryPattern.getShape("Square");
        shape3.draw();
    }
}

interface Shape{
    void draw();
}

class Rectangle implements Shape{

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}

class Circle implements Shape{

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}

class Square implements Shape{

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}